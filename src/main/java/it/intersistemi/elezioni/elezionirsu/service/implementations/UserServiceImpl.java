package it.intersistemi.elezioni.elezionirsu.service.implementations;//package it.intersistemi.elezioni.rsu.service.impl;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import it.intersistemi.elezioni.elezionirsu.mapper.UserMapper;
import it.intersistemi.elezioni.elezionirsu.model.UserDto;
import it.intersistemi.elezioni.elezionirsu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractCrudServiceJpaImpl <User, String, UserDto, UserRepository, UserMapper> {

    @Autowired
    protected UserServiceImpl(UserRepository repository, UserMapper mapper){
        super(repository, mapper);
    }

    @Override
    protected String getPK(User entity){
        return entity.getEmail();
    }

    public UserDto usersList (Integer idAllowedEmail){
        return mapper.entityToDto(repository.findByAllowedEmailId(idAllowedEmail));
    }
}

