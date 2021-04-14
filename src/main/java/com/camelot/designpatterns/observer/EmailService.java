package com.camelot.designpatterns.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 邮件服务
 */
@Service
public class EmailService implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("给用户"+userRegisterEvent.getUserName()+"发邮件");
    }
}
