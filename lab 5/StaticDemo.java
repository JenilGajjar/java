class Static {
    static int count = 0;

    public Static() {
        count++;
        System.out.println(count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();
    }
}