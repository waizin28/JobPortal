package com.waizin.jobportal.controller;

import com.waizin.jobportal.entity.Users;
import com.waizin.jobportal.entity.UsersType;
import com.waizin.jobportal.repository.UsersTypeRepository;
import com.waizin.jobportal.services.UsersService;
import com.waizin.jobportal.services.UsersTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;
    private final UsersService usersService;
    @Autowired
    public UsersController(UsersTypeService usersTypeService, UsersService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    // show user registeration form
    @GetMapping("/register")
    public String register(Model model){
        List<UsersType> userTypes = usersTypeService.getAll();
        model.addAttribute("getAllTypes", userTypes);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users){
        usersService.addNew(users);
        return "dashboard";
    }
}
