package com.liuyujiie.test;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 22:22
 **/
public class Cat extends Animnals {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }


    public void catchHouse() {
        System.out.println("抓老鼠");
    }
}
