package com.example.demo_uniTest.services;

import com.example.demo_uniTest.entities.User;
import com.example.demo_uniTest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);

    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User userDetails){
        return userRepository.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setFiscalCode(userDetails.getFiscalCode());
            return userRepository.save(user);
    });

    }
     public boolean deleteUser(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
     }


}
