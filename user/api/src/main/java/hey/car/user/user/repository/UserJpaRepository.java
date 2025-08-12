package hey.car.user.user.repository;

import hey.car.user.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository  extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);
}
