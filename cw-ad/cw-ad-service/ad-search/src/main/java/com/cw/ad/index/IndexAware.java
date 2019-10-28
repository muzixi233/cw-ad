package com.cw.ad.index;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/22 22:55
 */
public interface IndexAware<K,V> {
    V get(K key);
    void add(K key, V value);
    void update(K key, V value);
    void delete(K key,V value);
}
