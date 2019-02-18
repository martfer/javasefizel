package com.example.exercises.print_class_hierarchy;

import javax.swing.*;

public class ObjectHierarchy1 {

    public static void main(String[] args) {
        System.out.println(showHierarchyRecursive(JTextField.class));

    }

    private static String showHierarchyrecursive3(Class c, StringBuilder tab) {
        if (c.getSuperclass() == null) {
            return c.getName();
//            System.out.println(c.ObjectHierarchyObjectHierarchygetName());

        }
        String result = showHierarchyrecursive3(c.getSuperclass(), tab);
        tab.append("\t");
//        System.out.println(tab + c.getName());
        return result + "\n" + tab + c.getName();
    }

    private static String showHierarchyRecursive(Class c) {
        return showHierarchyrecursive3(c, new StringBuilder());
    }
}
