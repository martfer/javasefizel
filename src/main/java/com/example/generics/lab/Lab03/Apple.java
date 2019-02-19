package com.example.generics.lab.Lab03;

public class Apple extends Fruit implements Comparable<Apple> {
    public Apple (int size) {
	super("Apple", size);
    }
    public int compareTo (Apple that) {
	return
	    this.size < that.size ? - 1 :
	    this.size == that.size ? 0 : 1 ;
    }
}
