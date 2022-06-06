import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 1; i < 11; i++) {
            arrayDeque.add(i);
        }
        arrayDeque.addFirst(0);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
    }
}