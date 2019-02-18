package com.example.exercises.simple_studentlist;

import java.util.Arrays;

public class StudentList {
    Student[] students;

    public StudentList() {
        students = new Student[]{
                new Student("Pisti", "C"),
                new Student("Klára", "D"),
                new Student("Attila", "C")
        };
    }

    public StudentList(Student[] names) {
        this.students = names;
    }

    public Student[] getStudentArray() {
        //  return      Arrays.copyOf(students, students.length);
        Student[] result = new Student[students.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Student(students[i]);
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Tanulók: ";
        String separator = "";

        for (Student s : students) {
            result += separator + s;
            separator = ", ";
        }
        return result;
    }

    public void setStudent(int i, Student student) {
        students[i] = student;

    }

    public void appendStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }
}
