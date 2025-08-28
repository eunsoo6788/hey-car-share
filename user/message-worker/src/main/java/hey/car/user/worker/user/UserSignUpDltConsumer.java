package hey.car.user.worker.user;

import hey.car.user.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import webhook.slack.SlackContract;
import webhook.slack.SlackNotifier;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserSignUpDltConsumer {

    private final SlackNotifier slack;
    private final UserService userService;

    @KafkaListener(
            topics = "user.registered.dlt",
            groupId = "user-registered-dlt-group"
    )
    public void consume(String message) {

        // 로그 실패
        log.info("DLT 메세지 수신: " + message);



        // 슬랙 알림 발송
        SlackContract contract = SlackContract.builder()
                .title("회원가입 장애 발생")
                .message("회원가입 카프카 장애 발생")
                .icon(":ghost:")
                .iconUrl("https://slack.com/img/icons/app-57.png")
                .linkUrl("https://www.naver.com/")
                .build();

        slack.send(contract);

        // 로그 디비 저장

    }

}
