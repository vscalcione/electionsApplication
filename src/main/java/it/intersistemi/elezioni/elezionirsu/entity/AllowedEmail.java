package it.intersistemi.elezioni.elezionirsu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ALLOWED_EMAIL")
//@NamedQuery(name="AllowedEmail.findAll()", query = "SELECT ae FROM ALLOWED_EMAIL ae")
public class AllowedEmail implements Serializable {

    @Id
    @Column(name = "ID_ALLOWEDEMAIL", unique = true, nullable = false, length = 2)
    private Integer idAllowedEmail;

    @Column(name = "EMAIL_USER", unique = true, nullable = false, length = 20)
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
