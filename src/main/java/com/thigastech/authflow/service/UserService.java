package com.thigastech.authflow.service;

import com.thigastech.authflow.model.Role;
import com.thigastech.authflow.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public User register(User user) {

        user.setId((long) (users.size() + 1));
        user.setRole(Role.USER);
        user.setActive(true);

        users.add(user);

        return user;
    }

    public List<User> findAll() {
        return users;
    }
}