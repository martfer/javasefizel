package com.example.collections;

import java.util.Comparator;
import java.util.Map;

public class EntryComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Map.Entry e1 = (Map.Entry) o1;
        Map.Entry e2 = (Map.Entry) o2;

        Comparable comp1 = (Comparable) e1.getValue();
        Comparable comp2 =  (Comparable)e2.getValue();

        return comp2.compareTo(comp1);
    }
}
