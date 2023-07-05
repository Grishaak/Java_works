package Java_seminars.Java_seminar_three;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main_4 {
    public static void main(String[] args) {
        testQueue();
    }

    static void testStack() {
        Stack<String> stack = new Stack<>();
        stack.push("test1");
        stack.push("test3");
        stack.push("test2");
        stack.push("test4");

        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static void testQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");

//        System.out.println(queue);

//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
        for (String string : queue) {
            System.out.println(string);
        }
    }
}

