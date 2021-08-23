package pl.sdacademy.controllers;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.entities.User;
import pl.sdacademy.services.UserService;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/id/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/user/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByEmail(username);
    }
}