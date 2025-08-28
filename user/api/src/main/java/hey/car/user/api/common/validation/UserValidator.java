package hey.car.user.api.common.validation;

import hey.car.user.api.user.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserValidator {

    private final UserJpaRepository userRepository;

    public boolean exist(String username) {
        return userRepository.existsByUsername(username);
    }

}
