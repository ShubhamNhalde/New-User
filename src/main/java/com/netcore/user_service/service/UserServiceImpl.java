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
            new User(0001L, "Shubham", "12345"),
            new User(0002L, "Nikhil", "654321"),
            new User(0003L, "sunil", "888888"),
            new User(0004L, "Prasad", "777777")

    );
    @Override
    public User getUser(Long id) {
        log.info("Get Call For User Details");
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
