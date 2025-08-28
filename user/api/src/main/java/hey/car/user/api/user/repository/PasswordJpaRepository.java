package hey.car.user.api.user.repository;

import hey.car.user.api.user.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordJpaRepository extends JpaRepository<Password, Long> {

}
