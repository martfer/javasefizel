package com.example.boxing;

import java.util.Objects;

public class MyInteger {
    private int value;
    private int weight;

    public MyInteger(int value) {
        this.value = value;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
//        MyInteger myInteger = (MyInteger) o;
        return value == ((MyInteger)o).value &&
                weight == ((MyInteger)o).weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, weight);
    }
}
