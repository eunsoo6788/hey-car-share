package hey.car.user.api.user.controller.dto;


import hey.car.user.api.user.entity.UserType;

public record UserCreateReq(
        String username,
        String password,
        String email,
        String phone,
        UserType type
)
{ }
