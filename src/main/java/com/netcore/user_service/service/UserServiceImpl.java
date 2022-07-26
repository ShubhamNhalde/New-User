package com.netcore.user_service.service;

import com.netcore.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311L, "Shubham Nhalde", "123456"),
            new User(1312L, "Nikhil Patil", "654321"),
            new User(1313L, "Sunil Patil", "888888")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
