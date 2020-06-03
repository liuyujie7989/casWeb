package com.liuyujiie.test;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-19 22:24
 **/
public class Demo01Main {
    public static void main(String[] args) {
        //Animnals animnals = new Cat();


        giveMeAanimals(new Cat());
    }


    public static void giveMeAanimals(Animnals animnals) {
        if (animnals instanceof Cat) {
            Cat cat = (Cat) animnals;
            cat.catchHouse();
        }
        if (true) {
            System.out.println("1");
        } else if (true) {
            System.out.println("2");
        } else {
            System.out.println(4);
        }
        System.out.println("3");
    }


}
