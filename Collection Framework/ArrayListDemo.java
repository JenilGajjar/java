import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(3);
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(6);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l2.add(-1);
        l1.add(2);
        l2.add(-3);
        l1.add(-3);
        l1.addAll(l2);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.toArray()[i]);
        }
        l1.removeAll(l2);
        System.out.println(l1);
    }
}
