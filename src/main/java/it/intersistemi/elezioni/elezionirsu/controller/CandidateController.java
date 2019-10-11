package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.dto.CandidateDto;
import it.intersistemi.elezioni.elezionirsu.dto.ScoreDto;
import it.intersistemi.elezioni.elezionirsu.service.CandidateService;
import it.intersistemi.elezioni.elezionirsu.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/candidate")
public class CandidateController extends CrudController<CandidateDto, Integer, CandidateService> {

    @Autowired
    private ScoreService scoreService;

    @Autowired
    public CandidateController(CandidateService service){
        super(service);
    }

    @RequestMapping(value="/{id}/assignVote", method = RequestMethod.GET)
    public String showAssignVote(@PathVariable("id") Integer idCandidate,
                                 Model model){
        CandidateDto dto = this.service.findById(idCandidate);
        model.addAttribute(this.getEntityListModelName(), dto);
        model.addAttribute("idCandidate", idCandidate);
        model.addAttribute("voteCandidateList", scoreService.candidateScoreList(idCandidate));
        Iterable <ScoreDto> scoreList = scoreService.findAll();
        model.addAttribute("scoreList", scoreList);
        return "candidate/assignVote";
    }

//    @RequestMapping(value = "/{id}/assignVote", method = RequestMethod.POST)
//    public String saveAssignVote(@PathVariable("id") Integer idCandidate, @RequestParam(value="idScore", required = true) Integer idScore, Model model){
//        this.scoreService.assignUserVote();
//    }


    @Override
    protected String getEntityListModelName() {
        return "candidateList";
    }

    @Override
    protected String getEntityModelName() {
        return "candidate";
    }

    @Override
    protected String getListView() {
        return "candidate/candidateList";
    }

    @Override
    protected String getDetailsView() {
        return "candidate/candidateDetail";
    }

    @Override
    protected String getFormView() {
        return "candidate/formCandidate";
    }

    @Override
    protected String getListUrl() {
        return "/candidate";
    }
}
