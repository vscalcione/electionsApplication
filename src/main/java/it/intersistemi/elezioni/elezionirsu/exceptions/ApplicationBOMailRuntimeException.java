package it.intersistemi.elezioni.elezionirsu.exceptions;

import it.intersistemi.elezioni.elezionirsu.dto.beans.MessageCodeBean;

public class ApplicationBOMailRuntimeException extends ApplicationRuntimeException{
    public ApplicationBOMailRuntimeException(String message, MessageCodeBean messageCode) {
        super(message, messageCode);
    }
}
