package hey.car.user.user.controller;

import hey.car.user.user.controller.dto.UserCreateReq;
import hey.car.user.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public void create(@RequestBody UserCreateReq request) {
        userService.create(request);
    }

}
