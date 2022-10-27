package com.develiseu.userdept.controllers;

import com.develiseu.userdept.entities.User;
import com.develiseu.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findAll(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user){
        return repository.save(user);
    }
}
