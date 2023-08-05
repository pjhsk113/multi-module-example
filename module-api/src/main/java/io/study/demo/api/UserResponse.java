package io.study.demo.api;

import io.study.demo.domain.user.User;

public class UserResponse {
    private String name;

    public UserResponse(User user) {
        this.name = user.getName();
    }
}
