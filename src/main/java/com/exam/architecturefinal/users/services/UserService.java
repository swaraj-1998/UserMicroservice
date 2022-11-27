package com.exam.architecturefinal.users.services;

import com.exam.architecturefinal.users.daos.UserRepository;
import com.exam.architecturefinal.users.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String email, String password) {
        return userRepository.findUserByEmailAndAndPassword(email, password);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
