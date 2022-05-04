// The Transport interface declares a deliver () method. The abstract class Animal is the 
// super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
// implemented by the Camel and Donkey classes. Write a test program that initialize an 
// array of four Animal objects. If the object implements the Transport interface, the 
// deliver () method is invoked.

interface Transport {
    public void deliver();
}

abstract class Animal {
    public abstract void display();
}

class Tiger extends Animal {
    public void display() {
        System.out.println("Tiger Class ");
    }
}

class Deer extends Animal {
    public void display() {
        System.out.println("Deer class");

    }
}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Camel can be used for transportaion");
    }

    public void display() {
        System.out.println("Camel class");
    }
}

class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("Donkey can be used for transportaion");
    }

    public void display() {
        System.out.println("Donkey class");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        Donkey donkey = new Donkey();
        Camel camel = new Camel();
        tiger.display();
        deer.display();

        donkey.display();
        donkey.deliver();

        camel.display();
        camel.deliver();
    }
}