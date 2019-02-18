package com.example.exercises.print_class_hierarchy;

import java.lang.reflect.Method;

public class AnnotationDemo extends Parent {

    public static void main(String[] args) throws NoSuchMethodException {

        Class c = AnnotationDemo.class;

//        Method m = c.getDeclaredMethod("doIt");
//        System.out.println(Arrays.toString(m.getDeclaredAnnotations()));

        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.print(m);
//            System.out.println(m.getAnnotation(Override.class));
            if (m.getAnnotation(MyAnnotation.class) != null)  {
                System.out.println(" ***** is annotated with @MyAnnotation *****");
            }
            System.out.println();
        }

    }


    @Override
    @MyAnnotation
    public void doIt() {
        super.doIt();
    }

    public void dontDoIt() {}
}
