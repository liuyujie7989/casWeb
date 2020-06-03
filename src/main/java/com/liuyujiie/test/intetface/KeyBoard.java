package com.liuyujiie.test.intetface;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 22:59
 **/
public class KeyBoard implements USB {
    @Override
    public void oper() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
}
