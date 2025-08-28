package hey.car.user.api.user.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MessageTopic {

    // 도메인

    USER_CREATED("user.created"),;


    private final String topic;


}
