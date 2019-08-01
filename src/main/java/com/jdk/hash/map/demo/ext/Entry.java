package com.jdk.hash.map.demo.ext;

/**
 * Entry的作用=== Node节点
 */
public interface Entry<K, V> {

    K getKey();

    V getValue();

    V setValue(V v);

}
