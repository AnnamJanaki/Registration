package com.example.newreg.Controller;

import com.example.newreg.DTO.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.newreg.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registered")
    public ResponseEntity<String> register(@RequestBody UserDto userDto) {
        // Validate and save the user
        userService.createUser(userDto);

        return ResponseEntity.ok("Registration successful");
    }
}
