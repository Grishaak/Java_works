package Java_HM.Java_HM_4;


public class Main_2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.enqueue("head");
        myLinkedList.enqueue(4);
        myLinkedList.enqueue(5);
        myLinkedList.enqueue(6);
        myLinkedList.enqueue("tail");
        System.out.println(myLinkedList.dequeue());
        System.out.println(myLinkedList.dequeue());
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.first());
    }
}
