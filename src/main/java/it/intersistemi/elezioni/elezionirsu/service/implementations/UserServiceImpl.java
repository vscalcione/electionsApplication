package it.intersistemi.elezioni.elezionirsu.service.implementations;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import it.intersistemi.elezioni.elezionirsu.mapper.UserMapper;
import it.intersistemi.elezioni.elezionirsu.dto.UserDto;
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

    public UserDto usersList (String email){
        return mapper.entityToDto(repository.findByAllowedEmailId(email));
    }
}

