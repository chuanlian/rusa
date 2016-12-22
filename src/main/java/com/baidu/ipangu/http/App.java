/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ipangu.http;

import org.apache.commons.lang.StringUtils;

/**
 * Created by yangchuanlian on 2016/12/9.
 */
public class App {

    private static final String ADD_NAME = "a";
    private static final String ADD_PHONE = "b";
    private static final String ADD_EMAIL = "c";

    public static void main(String[] args) {
        if (args == null || args.length <= 0) {
            System.out.println("参数不能为空");
        }
        for (String arg : args) {
            if (StringUtils.equals(arg, ADD_NAME)) {
                System.out.println(ADD_NAME);
            }
            if (StringUtils.equals(arg, ADD_PHONE)) {
                System.out.println(ADD_PHONE);
            }
            if (StringUtils.equals(arg, ADD_EMAIL)) {
                System.out.println(ADD_PHONE);
            }
        }
    }
}
