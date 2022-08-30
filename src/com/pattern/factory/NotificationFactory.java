package com.pattern.factory;

import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @since 2022/8/30
 */
public class NotificationFactory {

    public static final String CHANNEL_SMS = "SMS";
    public static final String CHANNEL_EMAIL = "EMAIL";
    public static final String CHANNEL_PUSH = "PUSH";

    public Notification createNotification(String channel) {

        if (null == channel || channel.isEmpty()) {
            return null;
        }
        switch (channel) {
            case CHANNEL_SMS:
                return new SMSNotification();
            case CHANNEL_EMAIL:
                return new EmailNotification();
            case CHANNEL_PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel" + channel);
        }
    }

}
