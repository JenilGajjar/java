import java.util.*;

public class LinkedListAndStackDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // l1.addFirst(0);
        // l1.addLast(10);
        // System.out.println(l1);
        // peek does not remove an element only retrives
        // System.out.println(l1.peek());
        // System.out.println(l1.peekFirst());
        // System.out.println(l1.peekLast());
        // System.out.println(l1);

        // poll removes and retrives an element
        // System.out.println(l1.poll());
        // System.out.println(l1.pollFirst());
        // System.out.println(l1.pollLast());
        // System.out.println(l1);

        // pop removes and retrives an element
        // System.out.println(l1.pop());
        // System.out.println(l1.pop());
        // System.out.println(l1);

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 21; i++) {
            s.push(i);
        }
        // System.out.println(s.empty());
        // System.out.println(s.peek());
        System.out.println("stack : " + s);
        // System.out.println("LinkedList : " + l1);

        int sum = 0;
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            sum += temp;
        }
        System.out.println(sum);
    }
}