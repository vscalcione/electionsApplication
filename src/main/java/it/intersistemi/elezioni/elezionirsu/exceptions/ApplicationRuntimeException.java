package it.intersistemi.elezioni.elezionirsu.exceptions;

import it.intersistemi.elezioni.elezionirsu.dto.beans.MessageCodeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ApplicationRuntimeException extends RuntimeException{

    private static final Logger logger = LoggerFactory.getLogger(ApplicationRuntimeException.class);

    private final MessageCodeBean messageBean;

    public ApplicationRuntimeException(String message, MessageCodeBean messageBean)
    {
        super(message);
        //MG inserisco qui il log del messaggio, così non dovranno farlo i chiamanti creando le doppie stringhe
        logger.error(message);
        this.messageBean = messageBean;
    }

    public MessageCodeBean getMessageBean()
    {
        return messageBean;
    }
}
