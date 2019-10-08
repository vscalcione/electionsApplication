package it.intersistemi.elezioni.elezionirsu.repository;

import it.intersistemi.elezioni.elezionirsu.entity.Candidate;
import org.springframework.data.repository.CrudRepository;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {
}
