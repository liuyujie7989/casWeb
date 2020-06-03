package com.liuyujiie.test.intetface;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 22:57
 **/
public class Mouse implements USB {
    @Override
    public void oper() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
}
