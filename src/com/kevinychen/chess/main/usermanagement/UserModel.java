package com.kevinychen.chess.usermanagement;

import java.util.HashMap;
import java.util.Map;

public class UserModel {
    private Map<String, String> users; // Stores username and password

    public UserModel() {
        users = new HashMap<>();
    }

    public boolean addUser (String username, String email, String password) {
        if (!users.containsKey(username)) {
            users.put(username, password);
            return true;
        }
        return false;
    }

    public boolean validateUser (String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}