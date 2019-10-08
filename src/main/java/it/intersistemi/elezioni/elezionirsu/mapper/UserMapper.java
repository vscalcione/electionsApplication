package it.intersistemi.elezioni.elezionirsu.mapper;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import it.intersistemi.elezioni.elezionirsu.model.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements EntityToDtoMapper<UserDto, User> {


    @Override
    public void entityToDto(User entity, UserDto dto) {

        dto.setIdUser(entity.getIdUser());
        dto.setEmail(entity.getEmail());
        dto.setCodeLogin(entity.getCodeLogin());
        dto.setSentCodeLogin(entity.isSentCodeLogin());
        dto.setLoginDone(entity.isLoginDone());
        dto.setSentFormData(entity.isSentFormData());

    }

    @Override
    public void dtoToEntity(UserDto dto, User entity) {

        entity.setIdUser(dto.getIdUser());
        entity.setEmail(dto.getEmail());
        entity.setCodeLogin(dto.getCodeLogin());
        entity.setSentCodeLogin(dto.isSentCodeLogin());
        entity.setLoginDone(dto.isLoginDone());
        entity.setSentFormData(dto.isSentFormData());

    }

    @Override
    public UserDto createDtoInstance() {
        return new UserDto();
    }

    @Override
    public User createEntityInstance() {
        return new User();
    }
}
