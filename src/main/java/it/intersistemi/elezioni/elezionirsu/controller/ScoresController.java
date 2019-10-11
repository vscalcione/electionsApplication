package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.dto.ScoreDto;
import it.intersistemi.elezioni.elezionirsu.service.ScoreService;
import it.intersistemi.elezioni.elezionirsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/score")
public class ScoresController extends CrudController <ScoreDto, Integer, ScoreService> {

    @Autowired
    private UserService userService;

    @Autowired
    public ScoresController(ScoreService service){
        super(service);
    }

    @RequestMapping(value = "/{id}/showUsers", method = RequestMethod.GET)
    public String showEditForm(@PathVariable("id") Integer idScore, Model model){
        model.addAttribute("idScore", idScore);
        model.addAttribute("usersList", this.userService.userVoteList(idScore));
        return "score/userVoteList";
    }

    @Override
    protected String getEntityListModelName() {
        return "scoreList";
    }

    @Override
    protected String getEntityModelName() {
        return "score";
    }

    @Override
    protected String getListView() {
        return "score/scoreList";
    }

    @Override
    protected String getDetailsView() {
        return "score/scoreDetails";
    }

    @Override
    protected String getFormView() {
        return "score/scoreForm";
    }

    @Override
    protected String getListUrl() {
        return "/score";
    }
}
