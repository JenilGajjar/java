// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Crete and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color.

abstract class Vegetable {
    String color;

    public abstract String toString();
}

class Potato extends Vegetable {
    public Potato() {
        color = "yellow";
    }

    public String toString() {
        return ("color of potato is " + (color));
    }
}

class Brinjal extends Vegetable {
    public Brinjal() {
        color = "purple";
    }

    public String toString() {
        return ("color of Brinijal is " + (color));
    }
}

class Tomato extends Vegetable {
    public Tomato() {
        color = "purple";
    }

    public String toString() {
        return ("color of Tomato is " + (color));
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Vegetable p = new Potato();
        Vegetable t = new Tomato();
        Vegetable b = new Brinjal();
        System.out.println(p.toString());
        System.out.println(t.toString());
        System.out.println(b.toString());
    }
}