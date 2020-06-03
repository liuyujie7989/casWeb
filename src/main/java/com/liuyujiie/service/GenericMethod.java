package com.liuyujiie.service;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-26 22:24
 **/
public class GenericMethod {
    public static void main(String[] args) {
        show01("Str");
    }

    /**
     * 含有泛型的方法
     * @param <E>
     */
    private  static <E> void show01(E e) {
        System.out.println(e);

    }
}
