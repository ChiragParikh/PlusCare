package com.capworld.pluscare.controller;

import com.capworld.pluscare.model.User;
import com.capworld.pluscare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LoginController
{
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String Login()
    {
        return "Login Page...";
    }

    @PostMapping("/verifylogin")
    public ResponseEntity<?> verifyLogin(@RequestBody User user)
    {
        return userService.verifyUser(user);
    }
}
