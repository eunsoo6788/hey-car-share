package hey.car.user;

import kafka.config.ModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ModuleConfig.class)
public class CarUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarUserApplication.class, args);
    }

}
