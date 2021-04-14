package com.camelot.designpatterns.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author shihengfei
 */
@Service
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String userName){
        // TODO 执行注册逻辑
        System.out.println(userName+":执行注册逻辑");
        // 发布事件
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,userName));
    }
}
