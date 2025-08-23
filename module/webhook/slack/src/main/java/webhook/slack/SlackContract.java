package webhook.slack;

import lombok.Builder;

@Builder
public record SlackContract(
        String message,
        String linkUrl,
        String icon,
        String iconUrl,
        String title
) {}