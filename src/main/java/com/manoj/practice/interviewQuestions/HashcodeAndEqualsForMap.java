package com.manoj.practice.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEqualsForMap {

    public static void main(String[] args) {

        Map<MyObjectForMap, Integer> map = new HashMap<>();

        MyObjectForMap o1 = new MyObjectForMap("12", "Manoj");
        MyObjectForMap o2 = new MyObjectForMap("12", "Menon");

        map.put(o1, 1);
        map.put(o2, 2);
        System.out.println(map.size());

    }

}

class MyObjectForMap {

    private String id;
    private String name;

    MyObjectForMap(String i, String n) {
        this.id = i;
        this.name = n;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MyObjectForMap other = (MyObjectForMap) obj;
        if (id == null) {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (name == null) {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "MyObjectForMap [id=" + id + ", name=" + name + "]";
    }

}