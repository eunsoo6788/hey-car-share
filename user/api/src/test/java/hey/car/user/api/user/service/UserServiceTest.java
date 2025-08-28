package hey.car.user.api.user.service;

import hey.car.user.api.user.controller.dto.UserCreateReq;
import hey.car.user.api.user.repository.PasswordJpaRepository;
import hey.car.user.api.user.repository.UserJpaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import test.FixtureMonkeys;

import static org.assertj.core.api.Assertions.assertThatCode;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserJpaRepository userRepository;

    @Mock
    PasswordJpaRepository passwordRepository;

    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("회원가입 기능 구현")
    void create() {

        // fixture
        var req = FixtureMonkeys.fixtureMonkeyConstructorProperties().giveMeBuilder(UserCreateReq.class)
                .setNotNull("username")
                .setNotNull("password")
                .sample();

        // when & then
        assertThatCode(() -> userService.create(req))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("회원가입 기능 구현 - Req 필드에 null 주어지면 - 에러를 던진다.")
    void whenCreate_givenNull_thenThrow() {

        // fixture
        var req = FixtureMonkeys.fixtureMonkeyConstructorProperties().giveMeBuilder(UserCreateReq.class)
                .setNull("username")
                .setNotNull("password")
                .sample();

        // when & then
        assertThatCode(() -> userService.create(req))
                .doesNotThrowAnyExceptionExcept(AssertionError.class);
    }
}