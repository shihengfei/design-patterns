package com.camelot.designpatterns.build;

/**
 * 用户，建造者模式
 */
public class User {

    private String name;
    private String nickName;
    private Integer age;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.nickName = userBuilder.nickName;
        this.age = userBuilder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }

    static class UserBuilder{
        private String name;
        private String nickName;
        private Integer age;

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder nickName(String nickName){
            this.nickName = nickName;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
