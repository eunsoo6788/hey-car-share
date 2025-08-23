package webhook.slack;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
import org.springframework.util.Assert;

import java.io.IOException;

public class WebhookSlackNotifier implements SlackNotifier {


    private final String webhookUrl;

    public WebhookSlackNotifier(String webhookUrl) {
        Assert.hasText(webhookUrl, "slack.webhook-url must not be empty");
        this.webhookUrl = webhookUrl;
    }

    @Override
    public void send(SlackContract contract) {
        sendTo(null, contract);
    }

    @Override
    public void sendTo(String channel, SlackContract contract) {
        Payload payload = Payload.builder()
                .username(contract.title())
                .text(contract.message()+ "\n" + "<" + contract.linkUrl() + ">")
                .iconUrl(contract.iconUrl())
                .iconEmoji(contract.icon())
                .build();
        try {
            WebhookResponse res = Slack.getInstance().send(webhookUrl, payload);
        } catch (IOException e) {
        }
    }
}