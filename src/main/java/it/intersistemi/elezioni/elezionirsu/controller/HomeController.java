package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import it.intersistemi.elezioni.elezionirsu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private UserRepository repository;

    public HomeController(UserRepository repository){
        this.repository = repository;
    }



    @RequestMapping("")
    public String homePage(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("username",username);
        return "home";
    }

}

