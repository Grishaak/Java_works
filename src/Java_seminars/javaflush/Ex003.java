//package Lesson_04;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(6);
        deque.add(7);
        deque.add(8);
        System.out.println(deque.contains(7));
        deque.addFirst(1); deque.addLast(2);
        System.out.println(deque);
        deque.removeLast(); deque.removeFirst();
        System.out.println(deque);
        deque.offerFirst(1); deque.offerLast(2);
        deque.offerFirst(1); deque.offerLast(2);
        System.out.println(deque);
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque);
        System.out.printf("%d - %d\n",deque.getFirst(),  deque.getLast());
        System.out.println(deque);
        deque.peekFirst();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}