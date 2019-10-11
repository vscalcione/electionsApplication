//package it.intersistemi.elezioni.elezionirsu.mailsender;
//
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;
//import javax.mail.PasswordAuthentication;
//import java.net.Authenticator;
//
//public class UserAuthenticator extends Authenticator {
//
//    private String username;
//    private String password;
//
//    @Deprecated
//    public UserAuthenticator(String mailPass) {
//    }
//
//    public UserAuthenticator(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
////    @Override
////    protected PasswordAuthentication getPasswordAuthentication()
////    {
////        return new PasswordAuthentication(username, password);
////    }
//
//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
//    }
//}
