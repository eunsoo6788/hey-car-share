package hey.car.user.user.mapping;

import hey.car.user.user.controller.dto.UserCreateReq;
import hey.car.user.user.entity.Password;
import hey.car.user.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserCreateReq request);

    Password toEntity(String username, String password);

}
