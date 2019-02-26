package com.example.lambda;

@FunctionalInterface
public interface Mapper<T> {
	// An abstract method
	int map(T source);
}
