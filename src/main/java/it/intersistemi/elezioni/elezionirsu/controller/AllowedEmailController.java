package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.dto.AllowedEmailDto;
import it.intersistemi.elezioni.elezionirsu.service.AllowedEmailService;
import it.intersistemi.elezioni.elezionirsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/allowedEmail")
public class AllowedEmailController extends CrudController <AllowedEmailDto, Integer, AllowedEmailService> {

    @Autowired
    private UserService userService;

    @Autowired
    public AllowedEmailController(AllowedEmailService service){
        super(service);
    }

    @RequestMapping(value = "/{id}/showUser", method = RequestMethod.GET)
    public String showEditForm(@PathVariable("id") Integer idAllowedEmail, Model model){
        model.addAttribute("idAllowedEmail", idAllowedEmail);
        model.addAttribute("userList", this.userService.userEmailList(idAllowedEmail));
        return "allowedEmail/userEmailList";
    }

    @Override
    protected String getEntityListModelName() {
        return "allowedEmailList";
    }

    @Override
    protected String getEntityModelName() {
        return "allowedEmail";
    }

    @Override
    protected String getListView() {
        return "allowedEmail/allowedEmailList";
    }

    @Override
    protected String getDetailsView() {
        return "allowedEmail/allowedEmailDetail";
    }

    @Override
    protected String getFormView() {
        return "allowedEmail/formAllowedEmail";
    }

    @Override
    protected String getListUrl() {
        return "/allowedEmail";
    }
}
