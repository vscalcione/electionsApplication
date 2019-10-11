package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.dto.AllowedEmailDto;
import it.intersistemi.elezioni.elezionirsu.dto.UserDto;
import it.intersistemi.elezioni.elezionirsu.service.AllowedEmailService;
import it.intersistemi.elezioni.elezionirsu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController extends CrudController <UserDto, String, UserService> {

    @Autowired
    private AllowedEmailService allowedEmailService;

    @Autowired
    public UserController (UserService service){
        super(service);
    }

    @RequestMapping(value = "/{id}/assignEmail", method = RequestMethod.GET)
    public String showAssignEmail(@PathVariable String id, String email, Model model){
        UserDto  dto = this.service.findById(email);
        model.addAttribute(this.getEntityListModelName(), dto);
        model.addAttribute("email", email);
        model.addAttribute("userEmailList", allowedEmailService.userEmailList(email));
        Iterable <AllowedEmailDto> emailList = allowedEmailService.findAll();
        model.addAttribute("emailList", emailList);
        return "user/assignEmail";
    }

    @RequestMapping(value = "/{id}/assignEmail", method = RequestMethod.POST)
    public String saveAssignEmail(@PathVariable ("id") Integer idAllowedEmail, @RequestParam(value = "email", required = true) String email, Model model){
        this.allowedEmailService.assignUserEmail(idAllowedEmail, email);
        return "redirect:/user/" + email + "/assignEmail";
    }

    @RequestMapping(value = "{email}/removeUserEmail", method = RequestMethod.GET)
    public String removeUserEmail(@PathVariable("email") String email, @RequestParam(value = "idAllowedEmail", required = true) Integer idAllowedEmail, Model model){
        this.allowedEmailService.removeUserEmail(idAllowedEmail, email);
        return "redirect:/user/" + email + "assignEmail";
    }

    @Override
    protected String getEntityListModelName() {
        return "userList";
    }

    @Override
    protected String getEntityModelName() {
        return "user";
    }

    @Override
    protected String getListView() {
        return "user/userList";
    }

    @Override
    protected String getDetailsView() {
        return "user/userDetail";
    }

    @Override
    protected String getFormView() {
        return "user/formUser";
    }

    @Override
    protected String getListUrl() {
        return "/user";
    }
}
