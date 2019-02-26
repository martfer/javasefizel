package com.example.nested;

public class EnclosingNested {

    private int instanceInt =  5;

    private static class A {

        private void print(EnclosingNested e) {
            System.out.println(e.instanceInt);
        }

        private static String hello() {
            return "Hello from EnclosingNested.A.hello";
        }
        private static String callEnclosingBCHello() {
            return EnclosingNested.B.C.hello(); // compiles and runs without errors
        }
    }

    private static class B {
        public static class C {
            private static String hello() {
                return "Hello from EnclosingNested.B.C.hello()";
            }
            private static String callEnclosingAHello() {
                return EnclosingNested.A.hello(); // compiles and runs without errors
            }
        }

        private static String hello() {
            return "Hello from EnclosingNested.B.hello() ";
        }
    }

    public static void main(String[] args) {
        System.out.println(EnclosingNested.A.hello());
        System.out.println(EnclosingNested.A.callEnclosingBCHello());
        System.out.println(EnclosingNested.B.C.hello());
        System.out.println(EnclosingNested.B.C.callEnclosingAHello());
    }
}
