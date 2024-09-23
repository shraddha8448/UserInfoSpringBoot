package com.example.SpringBootWithDB.controller;

import com.example.SpringBootWithDB.modal.User;
import com.example.SpringBootWithDB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @Controller
// @ResponceBody
public class TestController {

    @Autowired
    private UserService userService;

    //@RequestMapping(value = "/add",method = RequestMethod.POST)
    @PostMapping("/add")
    public User add(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/getall")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){

        return userService.updateUser(id,user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id, @RequestBody User user){

        return userService.deleteUser(id,user);
    }

}
