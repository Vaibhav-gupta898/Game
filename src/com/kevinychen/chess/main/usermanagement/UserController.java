package com.kevinychen.chess.usermanagement;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    private UserModel userModel;

    public UserController() {
        userModel = new UserModel();
    }

    public String registerUser (String username, String email, String password) {
        if (userModel.addUser (username, email, password)) {
            return "Registration successful!";
        } else {
            return "Registration failed. Username may already exist.";
        }
    }

    public String loginUser (String username, String password) {
        if (userModel.validateUser (username, password)) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }
}