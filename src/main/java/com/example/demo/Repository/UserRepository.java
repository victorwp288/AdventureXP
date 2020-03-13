package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User validateUser(User user) {
        return user;
    }
}
