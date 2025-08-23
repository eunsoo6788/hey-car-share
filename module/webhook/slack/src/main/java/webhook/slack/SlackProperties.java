package webhook.slack;



import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "slack")
public record SlackProperties(
        String webhookUrl,
        String linkUrl,
        String icon,
        String iconUrl,
        String title
) {}