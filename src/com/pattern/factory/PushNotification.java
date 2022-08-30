package com.pattern.factory;

/**
 * <p>
 *
 * </p>
 *
 * @since 2022/8/30
 */
public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending as push notification");
    }
}
