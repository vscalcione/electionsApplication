package it.intersistemi.elezioni.elezionirsu.mailsender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailProperties {

    @Value("${mail.host.smtp}")
    private String smtpHost;

    @Value("${mail.port.smtp}")
    private int smtpPort;

    @Value("${mail.smtpAuth.smtp}")
    private boolean smtpAuth;

    @Value("${mail.socketFactory.port.smtp}")
    private int smtpSocketPort;

    @Value("${mail.socketFactory.class.smtp}")
    private String smtpSocketClass;

    @Value("${mail.proxy.proxySet}")
    private boolean proxySet;

    @Value("${mail.proxy.proxyHost}")
    private String proxyHost;

    @Value("${mail.proxy.proxyPort}")
    private int proxyPort;

    @Value("${mail.account.pass}")
    private String mailPass;
}
