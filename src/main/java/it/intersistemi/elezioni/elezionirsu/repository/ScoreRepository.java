package it.intersistemi.elezioni.elezionirsu.repository;

import it.intersistemi.elezioni.elezionirsu.entity.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreRepository extends CrudRepository<Score, Integer> {
}
