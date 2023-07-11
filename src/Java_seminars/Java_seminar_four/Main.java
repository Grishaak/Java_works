package Java_seminars.Java_seminar_four;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    Создать структуру для хранения Номеров паспортов
//    и Фамилий сотрудников организации.
//            123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//    Вывести данные по сотрудникам с фамилией Иванов.
    public static void main(String[] args) {
        passports passport = new passports();
        passport.addInfo("321456","Иванов");
        passport.addInfo("234561","Жиглов");
        passport.addInfo("234432","Розов");
        passport.addInfo("654321","Притча");
        passport.addInfo("345678","Эвенейк");
        passport.addInfo("332124","Иванов");

        System.out.println(passport.printInfo("Иванов"));
    }

}
