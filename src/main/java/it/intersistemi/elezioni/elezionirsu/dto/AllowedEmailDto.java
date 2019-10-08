package it.intersistemi.elezioni.elezionirsu.dto;

public class AllowedEmailDto{

    private Integer idAllowedEmail;
    private String emailUser;

    public Integer getIdAllowedEmail() {
        return idAllowedEmail;
    }

    public void setIdAllowedEmail(Integer idAllowedEmail) {
        this.idAllowedEmail = idAllowedEmail;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
}
