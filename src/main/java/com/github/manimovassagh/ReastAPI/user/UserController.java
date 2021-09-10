package com.github.manimovassagh.ReastAPI.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/home")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/home/{id}")
    public User getOneUser(@PathVariable(value = "id") Long id) {
        return userService.findOneUser(id);
    }


    @PostMapping(path = "/home")
    public User addNewUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }


    @DeleteMapping(value = "/home/{id}")
    public void removeUserFromList(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
