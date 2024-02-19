package com.signify.OnlineSystemApplication.controller;
import com.signify.OnlineSystemApplication.entity.UserInfo;
import com.signify.OnlineSystemApplication.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserServices userService;

    @PostMapping("/api/v1/users")
    public UserInfo saveUser(@RequestBody UserInfo userInfo){
        return userService.saveUser(userInfo);
    }

    @GetMapping("/api/v1/users/{id}")
    public UserInfo getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/api/v1/users/{id}")
    public UserInfo updateUser(@PathVariable("id") Long userId, @RequestBody UserInfo userInfo){
        return userService.updateUser(userId, userInfo);
    }

    @DeleteMapping("/api/v1/users/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        userService.deleteUserById(userId);
    }

}
