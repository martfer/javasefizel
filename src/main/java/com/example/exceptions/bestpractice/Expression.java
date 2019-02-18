package com.example.exceptions.bestpractice;


public class Expression {
    private long id;

    public Expression(long id) {
        this.id = id;
    }

    public void compute() {
        if (id == 3) {
            throw new RuntimeException("Expression 3 is faulty!!!");
        }
        System.out.println("computing: " + id);
    }

    @Override
    public String toString() {
        return "Expression{" +
                "id=" + id +
                '}';
    }
}
