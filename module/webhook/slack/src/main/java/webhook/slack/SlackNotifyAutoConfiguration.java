package webhook.slack;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(SlackProperties.class)
public class SlackNotifyAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean(SlackNotifier.class)
    @ConditionalOnProperty(prefix = "slack", name = "webhook-url", matchIfMissing = false)
    SlackNotifier webhookSlackNotifier(SlackProperties props) {
        return new WebhookSlackNotifier(props.webhookUrl());
    }
}
