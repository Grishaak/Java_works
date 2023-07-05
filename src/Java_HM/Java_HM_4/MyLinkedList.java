package Java_HM.Java_HM_4;

import java.util.LinkedList;

public class MyLinkedList {
    //    Реализуйте очередь с помощью LinkedList
//    со следующими методами: enqueue() - помещает элемент
//    в конец очереди, dequeue() - возвращает первый
//    элемент из очереди и удаляет его, first() - возвращает
//    первый элемент из очереди, не удаляя.
    LinkedList<Object> linkedList = new LinkedList<>();

    void enqueue(Object element){
        linkedList.addLast(element);
    }
    Object dequeue(){
        if (linkedList.isEmpty()){
            return null;
        }
        return linkedList.pollFirst();
    }
    Object first(){
        if (linkedList.isEmpty()){
            return null;
        }
        return linkedList.getFirst();
    }
}
