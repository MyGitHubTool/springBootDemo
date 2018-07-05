package com.ctban.swallow.service;

/**
 * @author GuoJie 2018/7/5 11:35
 */
public interface Defaulable {

    default String notRequired() {
        return "Default implementation";
    }
}
