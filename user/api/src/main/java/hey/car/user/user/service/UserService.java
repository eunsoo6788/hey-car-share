package hey.car.user.user.service;

import hey.car.user.user.controller.dto.UserCreateReq;
import hey.car.user.user.entity.Password;
import hey.car.user.user.entity.User;
import hey.car.user.user.mapping.UserMapper;
import hey.car.user.user.repository.PasswordJpaRepository;
import hey.car.user.user.repository.UserJpaRepository;
import kafka.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserJpaRepository userRepository;
    private final PasswordJpaRepository passwordRepository;


    @Transactional
    public void create(UserCreateReq request) {


        User user = UserMapper.INSTANCE.toEntity(request);
        userRepository.save(user);

        Password password = UserMapper.INSTANCE.toEntity(request.username(), request.password());
        passwordRepository.save(password);

        // 회원가입


    }




}
