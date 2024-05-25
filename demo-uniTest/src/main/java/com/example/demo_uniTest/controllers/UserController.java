package com.example.demo_uniTest.controllers;

import com.example.demo_uniTest.entities.User;
import com.example.demo_uniTest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/create")
    public @ResponseBody User create(@RequestBody User user){
       return userRepository.save(user);
    }
    @GetMapping("/")
    public @ResponseBody List<User> getList(){
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public @ResponseBody User getSingle(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else {
            return null;
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
    Optional<User> userOptional = userRepository.findById(id);
    if(userOptional.isPresent()){
        User user = userOptional.get();
        user.setName(userDetails.getName());
        user.setSurname(userDetails.getSurname());
        user.setFiscalCode(userDetails.getFiscalCode());
        return ResponseEntity.ok(userRepository.save(user));

    } else {
        return ResponseEntity.notFound().build();
    }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);

    }

    }

