/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ipangu.designPatterns.templateMode;

/**
 * Created by yangchuanlian on 2016/12/22.
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchool();

        System.out.println("========================");

        Teacher teacher = new Teacher();
        teacher.prepareGotoSchool();
    }
}
