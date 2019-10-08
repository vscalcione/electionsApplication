package it.intersistemi.elezioni.elezionirsu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
//@NamedQuery(name = "User.findAll()", query = "SELECT u FROM USER u")
public class User implements Serializable {

    @Column(name = "ID_USER", unique = true, nullable = false, length = 2)
    private Integer idUser;

    @Id
    @Column(name = "EMAIL", unique = true, nullable = false, length = 50)
    private String email;

    @Column(name = "CODE_LOGIN", unique = true, nullable = false, length = 200)
    private String codeLogin;

    @Column(name = "SENT_CODELOGIN", nullable = false)
    private boolean sentCodeLogin;

    @Column(name = "LOGIN_DONE", nullable = false)
    private boolean loginDone;

    @Column(name = "SENT_FORMDATA", nullable = false)
    private boolean sentFormData;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodeLogin() {
        return codeLogin;
    }

    public void setCodeLogin(String codeLogin) {
        this.codeLogin = codeLogin;
    }

    public boolean isSentCodeLogin() {
        return sentCodeLogin;
    }

    public void setSentCodeLogin(boolean sentCodeLogin) {
        this.sentCodeLogin = sentCodeLogin;
    }

    public boolean isLoginDone() {
        return loginDone;
    }

    public void setLoginDone(boolean loginDone) {
        this.loginDone = loginDone;
    }

    public boolean isSentFormData() {
        return sentFormData;
    }

    public void setSentFormData(boolean sentFormData) {
        this.sentFormData = sentFormData;
    }
}
