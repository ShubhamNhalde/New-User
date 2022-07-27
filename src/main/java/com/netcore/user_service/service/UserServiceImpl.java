package com.netcore.user_service.service;

import com.netcore.user_service.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    List<User> list = Arrays.asList(
            new User(1311L, "Shubham nhalde", "12345"),
            new User(1312L, "Nikhil", "654321")

    );
    @Override
    public User getUser(Long id) {
        log.info("Get Call For User Details");
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
