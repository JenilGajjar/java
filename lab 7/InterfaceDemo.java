
// Write a program that illustrates interface inheritance. Interface A is
// extended by A1
// and A2. Interface A12 inherits from both P1 and P2.Each interface declares
// one
// constant and one method. Class B implements A12.Instantiate B and invoke each
// of
// its methods. Each method displays one of the constants

interface A {
    public static final int a = 10;

    public void printA();
}

interface A1 extends A {
    public static final int b = 20;

    public void printA1();
}

interface A2 extends A {
    public static final int c = 30;

    public void printA2();
}

interface A12 extends A1, A2 {
    public static final int d = 40;

    public void printA12();
}

class B implements A12 {

    public void printA() {
        System.out.println(a);
    }

    public void printA1() {
        System.out.println(b);
    }

    public void printA2() {
        System.out.println(c);
    }

    public void printA12() {
        System.out.println(d);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.printA();
        obj.printA1();
        obj.printA2();
        obj.printA12();
    }
}