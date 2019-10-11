package it.intersistemi.elezioni.elezionirsu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SCORE")
//@NamedQuery(name = "Score.findAll", query = "SELECT s FROM Score s")
public class Score implements Serializable {

    @Id
    @Column(name = "ID_SCORE", unique = true, nullable = false, length = 2)
    private Integer idScore;

    @Column(name = "CANDIDATE_NAME", unique = true, nullable = false, length = 50)
    private String candidateName;

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}