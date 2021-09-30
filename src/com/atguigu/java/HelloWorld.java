package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author ywhstart
 * @create 2021-09-29-18:46
 */
public class HelloWorld {

    private static final int INITIAL_SIZE = 10;
    private static int num;
    private static int num1;

    /**
    *gdfgdf
    */
    private int rrr = 7;

    /**
    *gdfg
    */
    private String gg;



    public HelloWorld() {
    }
    public void testUpdate() {

    }
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        System.out.println("Hello world!!");
        System.out.println("Hello world!!");
        System.out.println("Hello java!!");
        ArrayList list = null;
        Date date = new Date();
        method1("6");
    }
    public static void method1(String a) {
        num1 = 10;
        System.out.println("aaa");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("a = " + a);
        System.out.println("HelloWorld.method1");
        int num = 10;
        System.out.println("num = " + num);
        int[] mm = new int[]{1,3,4,45,5,6};
        for (int i = 0; i < mm.length; i++) {
            System.out.println(mm[i]);
        }
        for (int i : mm) {
            System.out.println(i);
        }
        for (int i = 0; i < mm.length; i++) {
            int i1 = mm[i];
        }
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(3);
        list.add(34);

        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {

        }
        if (mm == null) {

        }
        if (mm != null) {

        }
        if (mm == null) {

        }
    }
}