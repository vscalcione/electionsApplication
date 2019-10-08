package it.intersistemi.elezioni.elezionirsu.dto;

public class ScoreDto{

    private Integer idScore;
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