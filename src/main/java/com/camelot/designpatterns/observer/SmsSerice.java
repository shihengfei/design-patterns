package com.camelot.designpatterns.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * 短信服务
 */
@Service
public class SmsSerice {

    @EventListener(value = UserRegisterEvent.class)
    public void sendSms(UserRegisterEvent userRegisterEvent) {
        System.out.println("给用户"+userRegisterEvent.getUserName()+"发短信");
    }
}
