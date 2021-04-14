# 观察者模式
### 模拟用户注册场景 用户发起注册后，需要发送短信、邮件、等操作
#### 1.定义事件 UserRegisterEvent
#### 2.实际行为中发布事件 UserService
#### 3.定义监听
##### a.实现 ApplicationListener
##### b.添加注解 @EventListener