package hey.car.user.api.user.service;

import hey.car.user.api.user.controller.dto.UserCreateReq;
import hey.car.user.api.user.entity.Password;
import hey.car.user.api.user.entity.User;
import hey.car.user.api.user.mapping.UserMapper;
import hey.car.user.api.user.repository.PasswordJpaRepository;
import hey.car.user.api.user.repository.UserJpaRepository;
import kafka.producer.MessageProducer;
import hey.car.user.api.user.entity.MessageTopic;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserJpaRepository userRepository;
    private final PasswordJpaRepository passwordRepository;
    private final MessageProducer producer;


    @Transactional
    public void create(UserCreateReq request) {


        User user = UserMapper.INSTANCE.toEntity(request);
        userRepository.save(user);

        Password password = UserMapper.INSTANCE.toEntity(request.username(), request.password());
        passwordRepository.save(password);

        producer.send(MessageTopic.USER_CREATED.getTopic(), user);
    }




}
