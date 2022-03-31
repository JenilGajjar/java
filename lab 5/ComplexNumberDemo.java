class ComplexNumber {
    double real;
    double image;

    public ComplexNumber() {
        real = 0;
        image = 0;
    }

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber c) {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + c.real;
        result.image = this.image + c.image;
        return result;
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(5, -1);
        ComplexNumber complexNumber2 = new ComplexNumber(6, 3);
        ComplexNumber complexNumber3 = complexNumber1.add(complexNumber2);

        System.out.println(complexNumber3.real + " + " + complexNumber3.image + "i");
    }
}