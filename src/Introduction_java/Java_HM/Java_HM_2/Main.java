package Introduction_java.Java_HM_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    /*Получить исходную json.txt строку из файла, используя FileReader или Scanner
     Дана json.txt строка вида:
     String json.txt = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
     "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
     "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

     Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
     Студент Иванов получил 5 по предмету Математика.
     Студент Петрова получил 4 по предмету Информатика.
     Студент Краснов получил 5 по предмету Физика.

     Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
     результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.

     *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
     */
    static Logger logger;

    public static void main(String[] args) {
        String filePath = "src/json.txt";
        String secondFilePath = "src/parsed_string.txt";
        String new_string = readFile(filePath);
        createLogger();
        System.out.println(new_string);
        String parsedString = parseString(new_string);
        writeToFile(parsedString, secondFilePath);
        closeLogger();
    }

    static String readFile(String pathFile) {
        File file = new File(pathFile);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String parseString(String unparsed) {
        String parametre = "получил";
        String parametre_2 = "по предмету";
        String new_String = unparsed.
                replaceAll("[{,:\"}]", "").
                replace("\\\\", " ").
                replace("\\", "").
                replace("[", "").
                replace("]", "").
                replace("фамилия", "Cтудент").
                replace("оценка", parametre).
                replace("предмет", parametre_2);
        String[] str = new_String.split(" ");
        return new_String;
    }

    static void writeToFile(String s1, String filePath) {

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(s1);
            writer.write("\n");
            writer.flush();
            logger.info("Запись успешно выполнена");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }
    }

    private static void closeLogger() {
        for (Handler handler : logger.getHandlers()) {
            handler.close();
        }
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("src/log.txt", true);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

    }

}
