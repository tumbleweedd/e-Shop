package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserRegistrationDTO;
import com.example.demo.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registration/new")
    public String getRegPage(Model model) {
        model.addAttribute("user", new UserRegistrationDTO());
        return "registration";
    }

    @PostMapping("/registration/new")
    public String regUser(UserRegistrationDTO userRegistrationDTO, Model model) {
        if (registrationService.save(userRegistrationDTO)) {
            return "redirect:/registration/new";
        } else {
            model.addAttribute("user", userRegistrationDTO);
        }
        return "registration/new";
    }
}
