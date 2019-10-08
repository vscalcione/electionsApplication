package it.intersistemi.elezioni.elezionirsu.mailsender;

import it.intersistemi.elezioni.elezionirsu.dto.beans.MessageCodeBean;
import it.intersistemi.elezioni.elezionirsu.dto.enums.MessageCode;
import it.intersistemi.elezioni.elezionirsu.exceptions.ApplicationBOMailRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.function.Supplier;

public class Mailer {

    private final static Logger logger = LoggerFactory.getLogger(Mailer.class);

     private interface CompositionStrategy{
         MimeMessage compose (Session session, UserAuthenticator userAuthenticator, EmailMessage emailMessage, EmailProperties emailProperties) throws Exception;
     }

     public static class MessageComposer{

         private MessageComposer(){ }
         static final CompositionStrategy STANDARD = Mailer::composeMessage
     }

     public static void sendMail(EmailProperties emailProperties, EmailMessage emailMessage){
         sendMail(mailProperties, emailMessage, MessageComposer.STANDARD, () -> new UserAuthenticator(mailProperties.getMailPass()));
     }

     public static void sendMail(EmailProperties emailProperties, EmailMessage emailMessage, CompositionStrategy compositionStrategy,
                                 Supplier<UserAuthenticator> authenticatorSupplier){
         final UserAuthenticator userAuth = authenticatorSupplier.get();
         try{
             Properties specifiedProperties = System.getProperties();
             specifiedProperties.setProperty("proxySet", String.valueOf(emailProperties.isProxySet()));
             specifiedProperties.setProperty("ProxyHost", emailProperties.getProxyHost());
             specifiedProperties.setProperty("ProxyPort", String.valueOf(emailProperties.getProxyPort()));
             specifiedProperties.setProperty("mail.smtp.host", emailProperties.getSmtpHost());
             specifiedProperties.setProperty("mail.smtp.port", String.valueOf(emailProperties.getSmtpPort()));
             specifiedProperties.setProperty("mail.smtp.socketFactory.class", emailProperties.getSmtpSocketClass() );

             // Ottengo una sessione SMTP
             Session session = Session.getInstance(specifiedProperties, userAuth);

             MimeMessage message = compositionStrategy.compose(session, userAuth, emailMessage, emailProperties);
             message.saveChanges();

             final Transport transport = session.getTransport(emailProperties.isSmtpAuth() ? "smtps" : "smtp");

             transport.connect(emailProperties.getSmtpHost(), emailProperties.getSmtpPort(), userAuth.getUsername(), userAuth.getPassword());
             transport.sendMessage(message, message.getAllRecipients());
             transport.close();
         }
         catch(AddressException exception){
             logger.error("Indirizzo che ha generato l'eccezione: {}", exception.getRef());
             logger.error("Posizione occorrenza errore:  {}", exception.getPos());
             logger.error("Oggetto del messaggio:  {}", emailMessage.getSubject());
             logger.error(exception.getMessage(), exception);
         }
         catch(Exception exception){
             throw new ApplicationBOMailRuntimeException(exception.getMessage(), new MessageCodeBean(MessageCode.EXCEPTION_MAIL));
         }
     }

    /*
     * Si occupa di comporre il messaggio: costruisce il corpo del messaggio
     * (testo) e aggiunge tutti gli eventuali allegati
     */
    private static MimeMessage composeMessage(Session session, UserAuthenticator userAuth, EmailMessage emailMessage, EmailProperties emailProperties) throws Exception {
        Multipart multipart = new MimeMultipart();
        InternetAddress iaFrom = new InternetAddress(userAuth.getUsername());

        // Costruisco l'oggetto mail
        MimeMessage message = new MimeMessage(session);
        message.setFrom(iaFrom);
        for(String rec : emailMessage.getToAddress())
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(rec));

        for(String rec : emailMessage.getCcAddress())
        {
            if ( rec!=null && ! rec.trim().equals("") )
                message.addRecipient(Message.RecipientType.CC, new InternetAddress(rec));
        }

        for(String rec : emailMessage.getBccAddress())
        {
            if ( rec != null && ! rec.trim().equals("") )
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(rec));
        }

        message.setSubject(getSubject(emailMessage.getSubject(), emailProperties.getEmailPrefix());

        // Creo il corpo del messaggio con il testo
        BodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailMessage.getTxtMessage(), "text/html; charset=UTF-8");

        multipart.addBodyPart( bodyPart );


        // Aggiungo il Multipart al messaggio
        message.setContent(multipart);
        return message;
    }

    private static String getSubject(String subject, String prefix) {
        String retVal;
        if(subject !=null && !"".equalsIgnoreCase(subject)){
            retVal=prefix+" - "+subject;
        }else{
            retVal=subject;
        }

        return retVal;
    }

}
