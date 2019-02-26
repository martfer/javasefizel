package com.example.nested;

public class Enclosing {
    public int i = 13;

    private class A {
        public int k;
        public int i;

        private String privateHello() {
            this.k = 3;
            Enclosing.this.i = 12;
            return "Enclosing.A.privateHello()";
        }
        public void printEnclosing() {
            System.out.println(Enclosing.this);
        }
    }

    private class B {
        private String callEnclosingAPrivateHello(A a) {
            return a.privateHello();  // compiles and runs without errors
        }
    }

    private A newA() {
        return new A();
    }

    private B newB() {
        return new B();
    }

    public static void main(String[] args) {

        Enclosing e = new Enclosing();
        Enclosing e1 = new Enclosing();
        A a = e.new A();
        System.out.println(e);
        a.printEnclosing();

        Enclosing.A a1 = e.newA();
        Enclosing.B b1 = e.newB();
        System.out.println(a1.privateHello());
        System.out.println(b1.callEnclosingAPrivateHello(a1));
    }
}
