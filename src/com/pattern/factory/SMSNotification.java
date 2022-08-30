package com.pattern.factory;

/**
 * <p>
 *
 * </p>
 *
 * @since 2022/8/30
 */
public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending as SMS notification");
    }
}
