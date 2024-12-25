package com.ssic.springboot.tutorial.controller;

import com.ssic.springboot.tutorial.model.User;
import com.ssic.springboot.tutorial.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository = new UserRepository();

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public HashMap<String, String> createUser(@RequestBody User user) {
        userRepository.save(user);
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "User created successfully!");
        return response;

    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }
}