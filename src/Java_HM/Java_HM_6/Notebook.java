package Java_HM.Java_HM_6;


public class Notebook {
    //    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков.
//    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//    отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//    Например:
//    “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также
//    в Map.
//    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//    Работу сдать как обычно ссылкой на гит репозиторий
//    Частые ошибки:
//1. Заставляете пользователя вводить все существующие критерии фильтрации
//2. Невозможно использовать более одного критерия фильтрации одновременно
//3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
//4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить
// еще ноутбук, то программа начинает работать некорректно
    static int count;
    int idNotebook;
    String model;
    String matrix;
    String RAM;
    String memory;
    String OS;
    String colour;

    public Notebook(String model, String matrix, String RAM, String memory, String OS, String colour) {
        this.idNotebook = count++;
        this.model = model;
        this.matrix = matrix;
        this.RAM = RAM;
        this.memory = memory;
        this.OS = OS;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "idNotebook: " + idNotebook +
                ", model: " + model +
                ", matrix : " + matrix +
                ", RAM: " + RAM +
                ", memory: " + memory +
                ", OS: " + OS +
                ", colour : " + colour;
    }
}
