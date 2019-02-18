package com.example.exercises.simple_studentlist;

class Student {
    private String name;
    private String clazz;

    public Student(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public Student(Student original) {
        this.name = original.name;
        this.clazz = original.clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return name + " (" + clazz + " osztály)";
    }
}
