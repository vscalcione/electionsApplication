package it.intersistemi.elezioni.elezionirsu.dto.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MessageCode {
    EXCEPTION_MAIL("exception.mail");

    private final String code;

    MessageCode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
