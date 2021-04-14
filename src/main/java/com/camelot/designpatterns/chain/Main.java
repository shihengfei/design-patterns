package com.camelot.designpatterns.chain;

/***
 * 测试责任链实现
 */
public class Main {

    public static void main(String[] args) {
        EmailFormatValidator emailFormatValidator = new EmailFormatValidator();
        EmailLegitimacyValidator emailLegitimacyValidator = new EmailLegitimacyValidator();
        emailFormatValidator.setNextValidator(emailLegitimacyValidator);
        emailFormatValidator.check("shihengfei@camelot.com");
    }
}
