package com.example.generics.basics;

import com.example.generics.Employee;
import com.example.generics.Engineer;
import com.example.generics.SeniorEngineer;

import java.util.ArrayList;
import java.util.List;

public class TestWrapper {
    public static void main(String[] args) {

////        ObjectWrapper hello = new ObjectWrapper("Hello");
////        Object result = hello.get();
//
//        Wrapper<String> sw = new Wrapper<>("Hello");
//        sw.set("World");
//        String result = sw.get();
//
//        Wrapper<Integer> iw = new Wrapper<>(1);
//
//        Wrapper raw = iw;
//        raw.set("World");
//        int j = iw.get();
        Wrapper<Employee> wr = new Wrapper<>();

        wr.set(new Employee());
        wr.set(new SeniorEngineer());

//        wr = new Wrapper<Engineer>();

        List<Engineer> engList = new ArrayList<>();
        engList.add(new Engineer());
        engList.add(new SeniorEngineer());
//        engList.add(new Employee());

        List<?> unknown = engList;
        unknown.add(null);

//        List<Employee> empList = engList;
//        empList.add(new Employee());
//        engList.get(2);

        Engineer[] engArr = new Engineer[3];
        engArr[0] = new Engineer();
        engArr[1] = new SeniorEngineer();
//        engArr[2] = new Employee();

//        Employee[] empArr = engArr;
        Object[]  oArr = engArr;
//        oArr[0] = new Object();

        lister(engArr);
        listerGeneric(engList);

    }

    public static void listerGeneric(List<?> l) {
        for (Object o : l) {
            System.out.println(o);
        }
    }

    public static void lister(Object[] oArr) {
        for (Object o : oArr) {
            System.out.println(o);
        }
    }

}
