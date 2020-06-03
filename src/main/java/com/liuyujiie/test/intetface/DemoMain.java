package com.liuyujiie.test.intetface;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 23:01
 **/
public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.useService(new Mouse());

        USB usb = new KeyBoard();

        computer.useService(usb);


    }
}
