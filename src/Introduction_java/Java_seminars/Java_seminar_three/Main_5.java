package Java_seminars.Java_seminar_three;

public class Main_5 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.size);
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("1");
        System.out.println(stack.size);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size);
//        System.out.println(stack.pop());
    }

}
