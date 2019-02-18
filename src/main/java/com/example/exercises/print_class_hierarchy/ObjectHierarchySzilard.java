package com.example.exercises.print_class_hierarchy;

import javax.swing.*;

public class ObjectHierarchySzilard {

    private static StringBuilder tab = new StringBuilder( " " );

    public static void main(String[] args) {
        Class jTextFieldClass = JTextField.class;
        getParentClass(jTextFieldClass);

        System.out.println(showHierarchy(JTextField.class));
        System.out.println(showHierarchy(String.class));


    }

    public static void getParentClass( Class childClass ){
        Class result;
        result = childClass.getSuperclass();
        if (result == null) {
            System.out.println(tab + childClass.getName() );
            tab.append("  ");
        } else {
            getParentClass(result);
            System.out.println( tab + result.getName() );
            tab.append("  "); }
    }

    public static String showHierarchy(Class clazz) {
        return "helo";
    }
}

