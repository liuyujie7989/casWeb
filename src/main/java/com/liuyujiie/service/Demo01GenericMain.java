package com.liuyujiie.service;

import com.liuyujiie.service.impl.Demo01ServiceImpl2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-26 22:36
 **/
public class Demo01GenericMain {
    public static void main(String[] args) {
        Demo01ServiceImpl2<String> objectDemo01ServiceImpl2 = new Demo01ServiceImpl2<>();
        objectDemo01ServiceImpl2.method("3w232");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(11);
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(12.0);
        list3.add(10.3);

      printArray(list1);
      printArray(list2);
      printArray(list3);
    }

    private static void printArray(ArrayList<?> arrayList) {
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
