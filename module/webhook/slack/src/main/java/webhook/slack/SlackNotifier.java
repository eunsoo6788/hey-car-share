package webhook.slack;


public interface SlackNotifier {
    void send(SlackContract text);
    void sendTo(String channel, SlackContract text);
}