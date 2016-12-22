/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ipangu.designPatterns;

/**
 * Created by yangchuanlian on 2016/12/22.
 */
public abstract class AbstractPerson {


    //抽象类定义整个流程骨架
    public void prepareGotoSchool() {
        operation();
    }

    private void operation() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract void dressUp();

    protected abstract void eatBreakfast();

    protected abstract void takeThings();
}
