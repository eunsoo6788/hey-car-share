package hey.car.user.user.repository;

import hey.car.user.user.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordJpaRepository extends JpaRepository<Password, Long> {

}
