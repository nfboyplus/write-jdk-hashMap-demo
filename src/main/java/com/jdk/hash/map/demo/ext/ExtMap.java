package com.jdk.hash.map.demo.ext;

/**
 * 纯手写Map接口
 */
public interface ExtMap<K, V> {

    /**
     * 向集合中插入数据
     */
    V put(K k, V v);

    /**
     * 根据 k 从 Map集合中查询元素
     */
    V get(K k);

    /**
     * 获取集合元素个数
     */
    int size();

}
