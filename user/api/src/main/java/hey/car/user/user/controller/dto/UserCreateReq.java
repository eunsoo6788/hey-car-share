package hey.car.user.user.controller.dto;


import hey.car.user.user.entity.UserType;

public record UserCreateReq(
        String username,
        String password,
        String email,
        String phone,
        UserType type
)
{ }
