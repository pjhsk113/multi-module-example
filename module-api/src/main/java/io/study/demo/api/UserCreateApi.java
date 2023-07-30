package io.study.demo.api;

import io.study.demo.user.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCreateApi {
    private final UserService userService;

    public UserCreateApi(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public NewUserResponse addUser(@RequestBody NewUserRequest request) {
        return new NewUserResponse(userService.add(request.getName()));
    }

    @GetMapping("/users/{userId}")
    public UserResponse findUser(@PathVariable Long userId) {
        return new UserResponse(userService.read(userId));
    }
}
