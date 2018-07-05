package com.ctban.swallow.service;

import java.util.function.Supplier;

/**
 * @author GuoJie 2018/7/5 11:35
 */
public interface DefaulableFactory {

    static Defaulable create(Supplier<Defaulable> supplier) {
        return supplier.get();
    }

}
