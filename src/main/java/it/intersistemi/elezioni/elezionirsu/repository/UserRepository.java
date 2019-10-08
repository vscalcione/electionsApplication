package it.intersistemi.elezioni.elezionirsu.repository;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, String> {
    User findByAllowedEmailId(Integer idAllowedEmail);
}
