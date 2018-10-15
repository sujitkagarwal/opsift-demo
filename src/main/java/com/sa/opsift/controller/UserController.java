package com.sa.opsift.controller;


import com.sa.opsift.entity.User;
import com.sa.opsift.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Authur : sujitagarwal
 * Created: 09/10/18.
 */
@RestController
@Slf4j
class UserController {


    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value= "/users", produces= MediaType.APPLICATION_JSON_VALUE)
    List<User> getAllUsers() {
        log.info("inside the controller");
        return userService.findAll();
    }
}