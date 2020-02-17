package com.kristyn.springboot2012;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class homeController {
    @GetMapping("/dogform")
    public String loadCarForm(Model model){
        model.addAttribute("dog", new Dog());
        return "dogform";
    }
    @PostMapping("/dogform")
    public String processCarForm(@Valid Dog dog, BindingResult result){
        if (result.hasErrors()){
            return "dogform";
        }
        return "dogfirmation";
    }
}