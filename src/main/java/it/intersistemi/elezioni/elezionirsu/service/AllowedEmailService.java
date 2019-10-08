package it.intersistemi.elezioni.elezionirsu.service;

import it.intersistemi.elezioni.elezionirsu.model.AllowedEmailDto;
import org.springframework.stereotype.Service;

@Service
public interface AllowedEmailService extends CrudService<AllowedEmailDto, Integer> {

    public Iterable <AllowedEmailDto> userEmailList(String email);
    public void assignUserEmail(Integer idAllowedEmail, String email);
    public void removeUserEmail(Integer idAllowedEmail, String email);

}
