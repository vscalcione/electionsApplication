package it.intersistemi.elezioni.elezionirsu.service;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import it.intersistemi.elezioni.elezionirsu.model.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface
UserService extends CrudService <UserDto, String> {
    Iterable <UserDto> userEmailList(Integer idAllowedEmail);
    User findByEmail(String email);

    Iterable <UserDto> userVoteList(Integer idScore);
}