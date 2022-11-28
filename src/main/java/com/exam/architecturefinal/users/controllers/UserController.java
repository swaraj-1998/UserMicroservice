package com.exam.architecturefinal.users.controllers;

import com.exam.architecturefinal.users.models.User;
import com.exam.architecturefinal.users.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/getUser")
    User getUser(@RequestParam String email, @RequestParam String password) {
        User u = userService.getUser(email, password);
        return u;
    }

    @GetMapping("/getAllUsers")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
