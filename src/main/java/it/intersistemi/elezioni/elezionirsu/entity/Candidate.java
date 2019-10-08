package it.intersistemi.elezioni.elezionirsu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CANDIDATE")
//@NamedQuery(name = "Candidate.findAll()",  query = "SELECT c FROM CANDIDATE c")
public class Candidate implements Serializable {

    @Id
    @Column(name = "ID_CANDIDATE", unique = true, nullable = false, length = 2)
    private Integer idCandidate;

    @Column(name = "CANDIDATE_NAME", unique = true, nullable = false, length = 50)
    private String candidateName;

    public Integer getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Integer idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}
