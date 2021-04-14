package com.camelot.designpatterns.chain;

import java.util.Objects;

/**
 * email 用户合法性校验
 * @author shihengfei
 */
public class EmailLegitimacyValidator extends EmailValidatorAbstract{
    @Override
    public void check(String value) {
        // 查库获取是否存在该邮箱
        if (Objects.equals("shihengfei@camelot.com",value)) {
            if (super.validator != null) {
                // 下一个
                super.validator.check(value);
            }
        }else {
            System.out.println("该邮箱未注册!");
        }
    }
}
