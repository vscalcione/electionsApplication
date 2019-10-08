package it.intersistemi.elezioni.elezionirsu.mapper;

import it.intersistemi.elezioni.elezionirsu.entity.Candidate;
import it.intersistemi.elezioni.elezionirsu.dto.CandidateDto;
import org.springframework.stereotype.Component;

@Component
public class CandidateMapper implements EntityToDtoMapper<CandidateDto, Candidate> {

    @Override
    public void entityToDto (Candidate entity, CandidateDto dto){
        dto.setIdCandidate(entity.getIdCandidate());
        dto.setNameCandidate(entity.getCandidateName());
    }

    @Override
    public void dtoToEntity (CandidateDto dto, Candidate entity){
        entity.setIdCandidate(dto.getIdCandidate());
        entity.setCandidateName(dto.getNameCandidate());
    }

    @Override
    public CandidateDto createDtoInstance() {
        return new CandidateDto();
    }

    @Override
    public Candidate createEntityInstance() {
        return new Candidate();
    }
}
