package hey.car.user.api;

import kafka.producer.config.KafkaProducerModuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(KafkaProducerModuleConfig.class)
public class CarUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarUserApplication.class, args);
    }

}
