package com.liuyujiie.service.impl;

import com.liuyujiie.service.DemoService01;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-26 22:14
 **/
public class Demo01ServiceImpl implements DemoService01<String> {

    @Override
    public void method(String e) {
        System.out.println(e);
    }
}
