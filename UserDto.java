package com.example.newreg.DTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class UserDto {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (username == null || username.isEmpty()) {
            errors.add("Username is required");
        }

        if (password == null || password.isEmpty()) {
            errors.add("Password is required");
        } else if (password.length() < 6) {
            errors.add("Password should be at least 6 characters");
        }

        return errors;
    }
}
