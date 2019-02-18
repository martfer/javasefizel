package com.example.exercises.simple_studentlist;




public class VisibilityDemo {
    public static void main(String[] args) {
        StudentList students = new StudentList();

        Object[] studentArray = students.getStudentArray();
        Object o = studentArray[0];

        System.out.println(o);


    }

}
