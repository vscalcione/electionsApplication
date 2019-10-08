package it.intersistemi.elezioni.elezionirsu.mailsender;

import com.sun.mail.smtp.SMTPTransport;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class EmailSender {

    private static final String SMTP_SERVER = "stmp.gmail.com";
    private static final String USERNAME = "vincenzo99.scalcione@gmail.com";
    private static final String PASSWORD = "vincenzo12345";

    private static final String EMAIL_FROM = USERNAME;
    private static final String EMAIL_TO = "v.scalcione@interistemi.it";
    private static final String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "Email Sender in Java";
    private static final String EMAIL_TEXT = "Test email";

    public static void sendEmail(){
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", SMTP_SERVER);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "25");

        Session session = Session.getInstance(properties, null);
        Message message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(EMAIL_FROM));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EMAIL_TO, false));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(EMAIL_TO_CC, false));
            message.setSubject(EMAIL_SUBJECT);
            message.setText(EMAIL_TEXT);
            message.setSentDate(new Date());

            SMTPTransport transport = (SMTPTransport) session.getTransport("smtp");
            transport.connect(SMTP_SERVER, USERNAME, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());

            System.out.println("Response: " + transport.getLastServerResponse());
            transport.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        sendEmail();
    }
}

