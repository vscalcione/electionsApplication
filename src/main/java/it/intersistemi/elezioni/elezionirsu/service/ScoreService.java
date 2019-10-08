package it.intersistemi.elezioni.elezionirsu.service;

import it.intersistemi.elezioni.elezionirsu.dto.ScoreDto;
import org.springframework.stereotype.Service;

@Service
public interface ScoreService extends CrudService<ScoreDto, Integer> {

    public Iterable <ScoreDto> candidateScoreList(Integer idCandidate);
    void assignUserVote(Integer idScore, String email);
    Iterable<ScoreDto> findAll();
    Object userVoteList(String email);
}
