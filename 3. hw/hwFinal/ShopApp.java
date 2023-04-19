import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        // инициализация и заполнение начального каталога ноутбуков
        NoteBookCatalogue catalogue = new NoteBookCatalogue();
        catalogue.addNoteBook(new NoteBook(1, "Lenovo", "ThinkPad-T15", 16, 500, "Windows", "Black"));
        catalogue.addNoteBook(new NoteBook(2, "ACER", "JHKG-3", 8, 250, "Windows", "Green"));
        catalogue.addNoteBook(new NoteBook(3, "HP", "JHFtyrj", 16, 800, "Windows", "Black"));
        catalogue.addNoteBook(new NoteBook(4, "Apple", "Air-PRO-SUPER-PUPER", 500, 500, "MAC-OS", "Silver"));
        catalogue.addNoteBook(new NoteBook(5, "ASUS", "kjskj", 8, 1000, "Windows", "Black"));
        catalogue.addNoteBook(new NoteBook(6, "Lenovo", "ThinkPad-T590", 16, 500, "Windows", "White"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите код фильтра по которому будет осуществлен поиск:\n" +
                    "1. ОЗУ\n" +
                    "2. Объем ЖД\n" +
                    "3. Операционная система\n" +
                    "4. Цвет\n" +
                    "0. Выйти из магазина\n");
            int code = sc.nextInt();
            sc.nextLine();
            switch (code) {
                case 1:
                    System.out.println("Укажите объем ОЗУ, который вас интересует");
                    int ram = sc.nextInt();
                    System.out.println(catalogue.getByRAM(ram));
                    break;
                case 2:
                    System.out.println("Укажите объем ЖД, который вас интересует");
                    int hd = sc.nextInt();
                    System.out.println(catalogue.getByHardDiskCapacity(hd));
                    break;
                case 3:
                    System.out.println("Укажите операционную систему, которая вас интересует");
                    String os = sc.nextLine();
                    System.out.println(catalogue.getByOS(os));
                    break;
                case 4:
                    System.out.println("Укажите  цвет, который вас интересует");
                    String colour = sc.nextLine();
                    System.out.println(catalogue.getByColour(colour));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Несуществующий код укажите допустимый!");
            }
        }
    }
}
