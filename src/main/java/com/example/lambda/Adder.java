package com.example.lambda;

@FunctionalInterface
public interface Adder {
	double add(double n1, double n2);
	default	double one() {
		return 1D;
	};
}
