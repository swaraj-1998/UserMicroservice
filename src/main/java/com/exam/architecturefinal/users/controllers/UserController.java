package com.exam.architecturefinal.users.controllers;

import com.exam.architecturefinal.users.models.User;
import com.exam.architecturefinal.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    void addUser(@RequestParam User user) {
        userService.addUser(user);
    }


    @GetMapping("/getUser")
    User getUser(@RequestParam String email, @RequestParam String password) {
        return userService.getUser(email, password);
    }

    @GetMapping("/getAllUsers")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
