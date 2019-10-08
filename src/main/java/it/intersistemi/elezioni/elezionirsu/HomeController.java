package it.intersistemi.elezioni.elezionirsu;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("")
    public String homepage(Model model) {
        return "home";
    }
}

