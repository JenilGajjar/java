class This {
    static int count = 0;

    public This() {
        this.count++;
        System.out.println(count);
    }
}

public class ThisDemo {
    public static void main(String[] args) {

        This obj1 = new This();
    }
}