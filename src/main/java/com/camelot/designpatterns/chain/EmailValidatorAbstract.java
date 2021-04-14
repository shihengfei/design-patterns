package com.camelot.designpatterns.chain;

/**
 * 责任链模式实现邮箱合法性校验
 * @author shihengfei
 */
public abstract class EmailValidatorAbstract {

    protected EmailValidatorAbstract validator;

    /***
     * 设置下一个处理类
     * @param validator
     */
    public void setNextValidator(EmailValidatorAbstract validator) {
        this.validator = validator;
    }

    /***
     * 检验方法
     * @param value
     */
    public abstract void check(String value);
}
