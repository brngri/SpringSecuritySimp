package com.brngri.springsecuritylearn.controller;

import org.springframework.web.bind.annotation.RestController;

import com.brngri.springsecuritylearn.entitys.Role;
import com.brngri.springsecuritylearn.reposiories.RoleRepository;
import com.brngri.springsecuritylearn.reposiories.UserRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    
    

}
