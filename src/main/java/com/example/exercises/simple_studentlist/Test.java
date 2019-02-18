package com.example.exercises.simple_studentlist;

public class Test {
    public static void main(String[] args) {

//        Student pisti = new Student("Pisti", "C");
//        Student copy = new Student(pisti);
//        System.out.println("pisti == copy " + (pisti == copy));
//        System.out.println(pisti);
//        System.out.println(copy);

        String s = new String("valami");
        System.out.println(s.getClass().getName());



        StudentList students = new StudentList(
                new Student[]{
                        new Student("Pisti", "C"),
                        new Student("Klára", "D"),
                        new Student("Attila", "C")
                }
        );

        System.out.println(students.getClass().getName());

        System.out.println(students);
        Student[] studentArray = students.getStudentArray();
        Student student0 = studentArray[0];
        student0.setName("Flint");
        student0.setClazz("X");


        System.out.println(students);
        students.appendStudent(new Student("Sára", "A"));
        System.out.println(students);

    }
}
