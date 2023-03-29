// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {

        int[] arr1 = new int[] {}; // для поиска однозначных простыъ чисел
        int[] arr2 = new int[] {}; // для поиска простыъ чисел от 10
        int[] arrResult = new int[] {}; // для вывода всех простых чисел

        for (int i = 1; i < 10; i = i + 2) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }

        }
    }
}
