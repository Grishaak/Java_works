package Lessons.Lesson_5;

public class workspace_worker {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 12342;
        Worker w2 = new Worker();
        w2.firstName = "Имя_1";
        w2.lastName = "Фамилия_1";
        w2.salary = 100;
        w2.id = 1234;
        Worker w3 = new Worker();
        w3.firstName = "Имя_1";
        w3.lastName = "Фамилия_1";
        w3.salary = 100;
        w3.id = 1234;
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
    }

}
