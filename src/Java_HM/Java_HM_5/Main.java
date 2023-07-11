package Java_HM.Java_HM_5;

public class Main {

    //    Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addContact("Иван",123456);
        telephoneBook.addContact("Иван",222222);
        telephoneBook.addContact("Иван",222222);
        telephoneBook.addContact("Вася",345678);
        telephoneBook.addContact("Вася",990909);
        telephoneBook.addContact("Миша",987654);
        telephoneBook.addContact("Иван",233333);
        System.out.println(telephoneBook.printAllContacts());
    }
}
