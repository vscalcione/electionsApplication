package it.intersistemi.elezioni.elezionirsu.dto.beans;

import it.intersistemi.elezioni.elezionirsu.dto.enums.MessageCode;

import java.util.Arrays;

public class MessageCodeBean {

    private MessageCode code;
    private String[] property;

    @Deprecated
    protected MessageCodeBean(MessageCode exceptionMail){}

    public MessageCodeBean(MessageCode code, String[] property) {
        this.code = code;
        this.property = property;
    }

    public MessageCode getCode() {
        return code;
    }

    public void setCode(MessageCode code) {
        this.code = code;
    }

    public String[] getProperty() {
        return property;
    }

    public void setProperty(String[] property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "MessageCodeBean{" +
                "code=" + code +
                ", property=" + Arrays.toString(property) +
                '}';
    }
}
