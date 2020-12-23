package com.manoj.practice.interviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLRU {

    public static void main(String[] args) {
        // useLRUCacheUsingCustomLinkedHashmap();
        useLRUCacheUsingMethodOverriding();
    }

    public static void useLRUCacheUsingCustomLinkedHashmap() {
        System.out.println("Using custom linked hash map...");
        MyLRUCacheByLinkedHashmap<String, Integer> myCacheObj = new MyLRUCacheByLinkedHashmap<>(5);

        myCacheObj.put("A", 1);
        myCacheObj.put("B", 1);
        myCacheObj.put("C", 1);
        myCacheObj.put("D", 1);
        myCacheObj.put("E", 1);

        // 5 elements
        myCacheObj.displayCache();
        System.out.println("######");
        myCacheObj.put("F", 1);
        myCacheObj.displayCache();
        System.out.println("######");
        myCacheObj.put("D", 1);
        myCacheObj.displayCache();
        System.out.println("######");

    }

    public static void useLRUCacheUsingMethodOverriding() {
        System.out.println("Using method overriding of linked hash map...");

        MyLRUCacheMethodOverriding<String, Integer> myCacheObj = new MyLRUCacheMethodOverriding<>(5);

        myCacheObj.put("A", 1);
        myCacheObj.put("B", 1);
        myCacheObj.put("C", 1);
        myCacheObj.put("D", 1);
        myCacheObj.put("E", 1);

        // 5 elements
        myCacheObj.displayCache();
        System.out.println("######");
        myCacheObj.put("F", 1);
        myCacheObj.displayCache();
        System.out.println("######");
        myCacheObj.put("D", 1);
        myCacheObj.displayCache();
        System.out.println("######");

    }

}

class MyLRUCacheByLinkedHashmap<K, M> {

    private Map<K, M> myCache = new LinkedHashMap<>();
    private int size;

    MyLRUCacheByLinkedHashmap(int size) {
        this.size = size;
    }

    public void put(K k, M m) {
        if (myCache.size() < size) {
            if (myCache.containsKey(k)) {
                myCache.remove(k);
            }
        }
        else {
            if (myCache.containsKey(k)) {
                myCache.remove(k);
            }
            else {
                Set<K> keySet = myCache.keySet();
                K key = keySet.iterator().next();
                myCache.remove(key);
            }
        }
        myCache.put(k, m);
    }

    public void displayCache() {
        myCache.forEach((x, y) -> System.out.println(String.format("Data in cache: %s , %s", x.toString(), y.toString())));
    }
}

class MyLRUCacheMethodOverriding<K, V> {

    private Map<K, V> myCache;
    private int size;

    MyLRUCacheMethodOverriding(int size) {
        this.size = size;
        myCache = new LinkedHashMap<K, V>() {

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return this.size() > size;
            }
        };

    }

    public void put(K k, V v) {
        myCache.put(k, v);
    }

    public void displayCache() {
        myCache.forEach((x, y) -> System.out.println(String.format("Data in cache: %s , %s", x.toString(), y.toString())));
    }
}
