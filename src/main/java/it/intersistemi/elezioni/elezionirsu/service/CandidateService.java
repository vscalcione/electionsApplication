package it.intersistemi.elezioni.elezionirsu.service;//package it.intersistemi.elezioni.elezionirsu.service;

import it.intersistemi.elezioni.elezionirsu.dto.CandidateDto;
import org.springframework.stereotype.Service;

@Service
public interface CandidateService extends CrudService <CandidateDto, Integer> {

    Iterable <CandidateDto> candidateListForId(Integer idCandidate);

}
