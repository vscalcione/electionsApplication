package it.intersistemi.elezioni.elezionirsu.dto;

public class UserDto{

    private Integer idUser;
    private String email;
    private String codeLogin;
    private boolean sentCodeLogin;
    private boolean loginDone;
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
