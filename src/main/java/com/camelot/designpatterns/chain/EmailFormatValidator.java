package com.camelot.designpatterns.chain;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * email 格式校验
 * @author shihengfei
 */
public class EmailFormatValidator extends EmailValidatorAbstract{
    @Override
    public void check(String value) {
        // 将正则表达式转化为 Predicate
        Predicate<String> emailFilter = Pattern
            .compile("^(.+)@camelot.com$")
            .asPredicate();
        boolean test = emailFilter.test(value);
        if (test) {
            if (super.validator != null) {
                // 下一个
                super.validator.check(value);
            }
        } else {
            System.out.println("邮箱格式不正确!");
        }

    }
}
