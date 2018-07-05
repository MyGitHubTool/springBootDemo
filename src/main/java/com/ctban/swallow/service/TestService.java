package com.ctban.swallow.service;

/**
 * @author GuoJie 2018/7/5 11:14
 */
public interface TestService {


    default String testMethod() {
        return "default Method";
    }

}
