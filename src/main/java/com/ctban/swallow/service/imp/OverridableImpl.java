package com.ctban.swallow.service.imp;

import com.ctban.swallow.service.Defaulable;

/**
 * @author GuoJie 2018/7/5 11:41
 */
public class OverridableImpl implements Defaulable {

    @Override
    public String notRequired() {
        return "OverridableImpl";
    }
}
