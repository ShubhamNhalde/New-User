package com.netcore.user_service.entity;

import lombok.Data;

@Data
public class User {

    private Long userId;
    private String name;
    private String phone;

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }
}
