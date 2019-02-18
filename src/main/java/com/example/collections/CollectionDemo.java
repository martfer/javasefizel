package com.example.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
//        List<Integer> l = new LinkedList<>();
//        System.out.println(l.getClass());
//
//        List<Integer> list = List.of(1, 2, 43);
//        list.add(111);
//        System.out.println(list.getClass());
//
//        // 2,3,4
//        int[] params = {2, 3, 4, 5, 6};
//        doIt(params);
//        doIt(2, 3, 4, 5, 6);

        Iterator<Integer> iterator = getList().iterator();
        System.out.println(getList().getClass());

    }

    public static void doIt(int... ints) {
        System.out.println(ints.getClass());
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static List<Integer> getList() {
        return Collections.emptyList();
    }
}
