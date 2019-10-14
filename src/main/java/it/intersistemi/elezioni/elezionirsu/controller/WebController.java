package it.intersistemi.elezioni.elezionirsu.controller;

import it.intersistemi.elezioni.elezionirsu.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@RestController
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/loginUser").setViewName("loginUser");
    }

    @GetMapping("/")
    public String showForm (User entity){
        return "allowedUser";
    }

    @PostMapping("/")
    public String checkLogin(@Valid User entity, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "allowedUser";
        }
        return "redirect:/loginUser";
    }

}
