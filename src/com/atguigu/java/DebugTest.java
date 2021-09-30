package com.atguigu.java;

import java.util.HashMap;

/**
 * @author ywhstart
 * @create 2021-09-30-15:30
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","AAA");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age" + age);
        map.remove("major");
        System.out.println(map);
    }
}
