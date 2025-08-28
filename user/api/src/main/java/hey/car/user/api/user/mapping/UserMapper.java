package hey.car.user.api.user.mapping;

import hey.car.user.api.user.controller.dto.UserCreateReq;
import hey.car.user.api.user.entity.Password;
import hey.car.user.api.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserCreateReq request);

    Password toEntity(String username, String password);

}
