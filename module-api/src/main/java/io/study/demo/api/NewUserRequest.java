package io.study.demo.api;

public class NewUserRequest {
    private String name;

    public NewUserRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
