package com.liuyujiie.test.list;

import java.util.*;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-05-27 23:38
 **/
public class Demo01Hash {
    /**
     *
     * HashSet集合存储数据的结构是 哈希表
     * 哈希值 Object类中获取 哈希值的方法  hash();
     *       哈希值是对象的逻辑地址,是一个十进制的数字，由系统随机给出
     *  hash()源码
     *   public native int hash();  native 代表方法调用本地操作系统的方法
     *
     *重点：
     *
     *   哈希表
     *    1、jdk1.8之前 哈希表结构是 数组+链表
     *       jdk1.8之后 哈希表的机构是 数组+红黑树 特点：查询快
     *     2、哈希表数据结构：
     *          数组结构作用： 把元素进行了分组（相同哈希值的元素是一组），数组结构存储的是元素的哈希值，改数组的元素各不相同
     *
     *          链表/红黑树：把哈希值相同的元素连接在一起，存储的是元素的值
     *              如果有链表的长度超过了8位，就会把链表结构转化为红黑树（提高查询效率）
     *           红黑树：二叉查找树，每个节点不超过2
     *           1. 节点可以是红色的或者黑色的
     *           2. 根节点是黑色的
     *           3. 叶子节点(特指空节点)是黑色的
     *           4. 每个红色节点的子节点都是黑色的
     *           5. 任何一个节点到其每一个叶子节点的所有路径上黑色节点数相同
     *           红黑树的特点: 速度特别快,趋近平衡树,查找叶子元素最少和最多次数不多于二倍
     *    HashSet不容许存储相同元素的原理：
     *          调用add()添加元素时，先调用元素的hash()的方法，判断集合底层数组结构有没有存储这个哈希值，如果没有则添加，
     *          如果有则调用元素的equels方法，判断元素的值是否相同，如果不相同则添加，相同则不添加
     *
     *
     *
     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        LinkedList<String> list = new LinkedList<>();// 双向链表结构

        //单向链表结构无序  节点类保留下一节点的引用。链表类只保留头节点的引用，只能从头节点插入删除；
        //双向链表有序  一条存储值 一条存储数据的位置  节点类保留上一节点、下一节点的引用。链表类保留头节点、尾节点的引用，可以从尾节点插入删除；


        //底层哈希表
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
        Set<Map.Entry<String, String>> entries1 = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entries1) {
            System.out.println(stringStringEntry.getKey()+"--"+stringStringEntry.getValue());
        }


        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 底层 哈希表+链表（元素有序）
        LinkedHashMap<String,String> linkedHashMap= new  LinkedHashMap<String,String>();
        //
    }




}
