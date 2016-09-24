package com.xx.hbm.util;

import java.util.UUID;

/**
 * Created by Administrator on 2016/9/24.
 *
 * 32为UUID生成器
 */
public class UUIDGenerator {


    public static String randUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
