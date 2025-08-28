package hey.car.user.worker.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class UserSignupConsumer {

//    private final UserService service;

    @KafkaListener(topics = "user.registered", groupId = "user-register-group")
    @RetryableTopic(
            attempts = "5",
            backoff = @Backoff(delay = 500, multiplier = 2),
            dltTopicSuffix = ".dlt"
    )
    public void consume(String message) {

        log.error("!!오류발생 메세지 : " + message);
        throw new RuntimeException();
    }
}
