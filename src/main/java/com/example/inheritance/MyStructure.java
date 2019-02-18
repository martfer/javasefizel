package com.example.inheritance;

import java.util.Arrays;


public class MyStructure {
    char[] value;


    public MyStructure(char[] value) {
        this.value = value;
    }

    public MyStructure(String s) {
        this.value = s.toCharArray();
    }

    @Override
    public String toString() {
        return "MyStructure{" +
                "value=" + Arrays.toString(value) +
                '}';
    }

    public char[] getChars() {
        int length = value.length;
        char[] copy = Arrays.copyOf(value,length);

        return copy;
    }
}
