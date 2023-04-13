import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nНажмите:\n" +
                    "1 Добавить контакт\n" +
                    "2 Вывести все контакты\n" +
                    "0 Закрыть телефонную книгу\n");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    addContact();
                    break;
                case 2:
                    getAllContacts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Внимание! Введите допустимый код действия!");
            }
        }
    }

    private static void addContact() {
        String surname;
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        surname = scanner.nextLine();
        System.out.println("Введите номер");
        number = scanner.nextLine();
        phoneBook.put(surname, number);
        System.out.println("Запись успешно добавлена\n");
    }

    private static void getAllContacts() {
        phoneBook.entrySet().forEach(es -> System.out.println("Фамилия:"+ es.getKey() + "\nНомер: " + es.getValue()));
    }


}