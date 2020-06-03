package com.liuyujiie.test.intetface;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 23:00
 **/
public class Computer {

    public void  useService(USB usb) {
        usb.oper();
        usb.close();
    }

}
