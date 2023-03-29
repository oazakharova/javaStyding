import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the symbol: ");
        String symbol = sc.next();
        System.out.println("Enter the 2 number: ");
        int number2 = sc.nextInt();
        sc.close();

        // правильно сравнивать объекты через .equals, тк == сравнивает ссылки, а у всех
        // объектов они разные
        if (symbol.equals("+")) {
            System.out.println(String.format("The result is = %d", number1 + number2));
        }

        if (symbol.equals("-")) {
            System.out.println(String.format("The result is = %d", number1 - number2));
        }

        if (symbol.equals("*")) {
            System.out.println(String.format("The result is = %d", number1 * number2));
        }

        if (symbol.equals("/")) {
            System.out.println(String.format("The result is = %d", number1 / number2));
        }
    }
}
