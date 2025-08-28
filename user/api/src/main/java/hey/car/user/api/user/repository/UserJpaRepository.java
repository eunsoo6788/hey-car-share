package hey.car.user.api.user.repository;

import hey.car.user.api.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository  extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);
}
