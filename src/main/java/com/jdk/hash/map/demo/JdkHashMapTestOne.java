package com.jdk.hash.map.demo;

import com.jdk.hash.map.demo.ext.ExtHashMap;

/**
 * 纯手写JDK1.7版本HasMap集合框架
 */
@SuppressWarnings("unchecked")
public class JdkHashMapTestOne {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //基于什么原则 后进先出 非公平锁与公平锁
        ExtHashMap extHashMap = new ExtHashMap<String, String>();
        for (int i = 0; i < 10000; i++){
            extHashMap.put(i + "", i + "");
        }
        for (int i = 0; i < 10000; i++){
            extHashMap.get("" + i + "");
            System.out.println(extHashMap.get("" + i + ""));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        // 修改3号之后
        System.out.println(extHashMap.get("3号"));
        System.out.println("扩容之前获取数据:" + extHashMap.get("1号"));
        extHashMap.print();
        extHashMap.put(14 + "号", 14 + "号");
        extHashMap.put(1 + "号", "4444号");
        System.out.println("扩容之后获取数据:" + extHashMap.get("1号"));

    }

}
