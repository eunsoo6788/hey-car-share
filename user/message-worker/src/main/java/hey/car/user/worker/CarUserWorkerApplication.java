package hey.car.user.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import webhook.slack.SlackNotifyAutoConfiguration;

@SpringBootApplication
@Import(SlackNotifyAutoConfiguration.class)
public class CarUserWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarUserWorkerApplication.class, args);
    }

}
