package com.liuyujiie.test.exception;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-06-02 23:35
 **/
public class Demo01Exception {


    public static void main(String[] args) {
        method();
    }


    public static String method() {
        String a = "abvc";
        try {
            int[] array= new int[3];
           int b = array[3];
        } catch (Exception e) {
            String s = get();
            System.out.println(s);
             throw new RuntimeException("索引越界");

        }
        return a;
    }

    public static String get() {
        System.out.println("执行了");
        return  "aaa";
    }
}
