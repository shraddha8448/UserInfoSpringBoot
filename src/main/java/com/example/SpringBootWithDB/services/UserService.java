package com.example.SpringBootWithDB.services;

import com.example.SpringBootWithDB.modal.User;
import com.example.SpringBootWithDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){

        return userRepository.save(user);
    }

    public List<User> getAllUser(){

        return userRepository.findAll();
    }

    public User getById(Long id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("Id Not Found"));

    }

    public User updateUser(Long id, User user){
        User user_data = getById(id);
        if(user_data != null){
            user_data.setfName(user.getfName());
            user_data.setlName(user.getlName());
            return userRepository.save(user_data);
        }
        return null;
    }


}
