package com.example.ecommerce.Controller;

import com.example.ecommerce.Model.User;
import com.example.ecommerce.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
         return userService.getUsers();
    }

    @PostMapping
    public User addUser(User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
