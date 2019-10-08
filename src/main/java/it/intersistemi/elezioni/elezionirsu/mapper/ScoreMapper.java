package it.intersistemi.elezioni.elezionirsu.mapper;

import it.intersistemi.elezioni.elezionirsu.entity.Score;
import it.intersistemi.elezioni.elezionirsu.model.ScoreDto;
import org.springframework.stereotype.Component;

@Component
public class ScoreMapper implements EntityToDtoMapper<ScoreDto, Score> {


    @Override
    public void entityToDto(Score entity, ScoreDto dto) {
        dto.setIdScore(entity.getIdScore());
        dto.setCandidateName(entity.getCandidateName());
    }

    @Override
    public void dtoToEntity(ScoreDto dto, Score entity) {
        entity.setIdScore(dto.getIdScore());
        entity.setCandidateName(dto.getCandidateName());
    }

    @Override
    public ScoreDto createDtoInstance() {
         return new ScoreDto();
    }

    @Override
    public Score createEntityInstance() {
        return new Score();
    }
}
