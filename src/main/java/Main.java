import java.util.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Задание 1. Уникальные слова");
        System.out.println("-----------------");
        List<String> words = Arrays.asList(
                "Dresden", "Bremen", "Aschaffenburg", "Berlin", "Stuttgart",
                "Oldenburg", "Schwerin", "Frankfurt-am-Main", "Tübingen", "München",
                "Oldenburg", "Berlin", "Bremen", "Stuttgart", "Berlin",
                "Pirmasens", "Bremen", "München", "Köln", "Mainz"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Исходный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
        System.out.println("********************************");

        System.out.println("Задание 2. Телефонный справочник");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("-----------------");
        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "123654789");
        phonebook.add("Петров", "002236524");
        phonebook.add("Сидоров", "985478583");
        phonebook.add("Сидоров", "145236987");
        phonebook.add("Петров", "362541852");
        System.out.println("-----------------");

        System.out.println("Записанные номера:");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Запись отсутствует");
        System.out.println("Сергеев");
        System.out.println(phonebook.get("Сергеев"));
        System.out.println("-----------------");

        System.out.println("Запись номера");
        phonebook.add("Иванов", "362514");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}