//package it.intersistemi.elezioni.elezionirsu.mailsender;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class EmailProperties {
//
//    @Value("${mail.host.smtp}")
//    private String smtpHost;
//
//    @Value("${mail.port.smtp}")
//    private int smtpPort;
//
//    @Value("${mail.smtpAuth.smtp}")
//    private boolean smtpAuth;
//
//    @Value("${mail.socketFactory.port.smtp}")
//    private int smtpSocketPort;
//
//    @Value("${mail.socketFactory.class.smtp}")
//    private String smtpSocketClass;
//
//    @Value("${mail.proxy.proxySet}")
//    private boolean proxySet;
//
//    @Value("${mail.proxy.proxyHost}")
//    private String proxyHost;
//
//    @Value("${mail.proxy.proxyPort}")
//    private int proxyPort;
//
//    @Value("${mail.account.pass}")
//    private String mailPass;
//
//    @Value("${mail.receiver}")
//    private String mailReceiver;
//
//    @Value("${mail.suffix}")
//    private String mailSuffix;
//
//    @Value("${mail.from}")
//    private String mailSender;
//
//    public String getSmtpHost() {
//        return smtpHost;
//    }
//
//    public void setSmtpHost(String smtpHost) {
//        this.smtpHost = smtpHost;
//    }
//
//    public int getSmtpPort() {
//        return smtpPort;
//    }
//
//    public void setSmtpPort(int smtpPort) {
//        this.smtpPort = smtpPort;
//    }
//
//    public boolean isSmtpAuth() {
//        return smtpAuth;
//    }
//
//    public void setSmtpAuth(boolean smtpAuth) {
//        this.smtpAuth = smtpAuth;
//    }
//
//    public int getSmtpSocketPort() {
//        return smtpSocketPort;
//    }
//
//    public void setSmtpSocketPort(int smtpSocketPort) {
//        this.smtpSocketPort = smtpSocketPort;
//    }
//
//    public String getSmtpSocketClass() {
//        return smtpSocketClass;
//    }
//
//    public void setSmtpSocketClass(String smtpSocketClass) {
//        this.smtpSocketClass = smtpSocketClass;
//    }
//
//    public boolean isProxySet() {
//        return proxySet;
//    }
//
//    public void setProxySet(boolean proxySet) {
//        this.proxySet = proxySet;
//    }
//
//    public String getProxyHost() {
//        return proxyHost;
//    }
//
//    public void setProxyHost(String proxyHost) {
//        this.proxyHost = proxyHost;
//    }
//
//    public int getProxyPort() {
//        return proxyPort;
//    }
//
//    public void setProxyPort(int proxyPort) {
//        this.proxyPort = proxyPort;
//    }
//
//    public String getMailPass() {
//        return mailPass;
//    }
//
//    public void setMailPass(String mailPass) {
//        this.mailPass = mailPass;
//    }
//
//    public String getMailReceiver() {
//        return mailReceiver;
//    }
//
//    public void setMailReceiver(String mailReceiver) {
//        this.mailReceiver = mailReceiver;
//    }
//
//    public String getMailSuffix() {
//        return mailSuffix;
//    }
//
//    public void setMailSuffix(String mailSuffix) {
//        this.mailSuffix = mailSuffix;
//    }
//
//    public String getMailSender() {
//        return mailSender;
//    }
//
//    public void setMailSender(String mailSender) {
//        this.mailSender = mailSender;
//    }
//}
