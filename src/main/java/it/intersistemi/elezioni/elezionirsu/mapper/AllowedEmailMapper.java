package it.intersistemi.elezioni.elezionirsu.mapper;

import it.intersistemi.elezioni.elezionirsu.entity.AllowedEmail;
import it.intersistemi.elezioni.elezionirsu.model.AllowedEmailDto;
import org.springframework.stereotype.Component;

@Component
public class AllowedEmailMapper implements EntityToDtoMapper <AllowedEmailDto, AllowedEmail> {

    @Override
    public void entityToDto(AllowedEmail entity, AllowedEmailDto dto) {
        dto.setIdAllowedEmail(entity.getIdAllowedEmail());
        dto.setEmailUser(entity.getEmailUser());
    }

    @Override
    public void dtoToEntity(AllowedEmailDto dto, AllowedEmail entity) {
        entity.setIdAllowedEmail(dto.getIdAllowedEmail());
        entity.setEmailUser(dto.getEmailUser());
    }

    @Override
    public AllowedEmailDto createDtoInstance() {
        return new AllowedEmailDto();
    }

    @Override
    public AllowedEmail createEntityInstance() {
        return new AllowedEmail();
    }
}
