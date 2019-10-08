package it.intersistemi.elezioni.elezionirsu.exceptions;

public class ApplicationBOMailRuntimeException extends ApplicationRuntimeException{
    public ApplicationBOMailRuntimeException(String message, MessageCodeBean messageCode) {
        super(message, messageCode);
    }
}
