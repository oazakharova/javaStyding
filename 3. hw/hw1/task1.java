import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // System.out.println(n);

        int triangleSum = 0;
        int factorial = 1;

        // поиск треугольного числа
        for (int i = 1; i < n + 1; i++) {
            triangleSum += i;

        }
        System.out.println(String.format("Triangle n = %d", triangleSum));

        // поиск факториала
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        System.out.println(String.format("n! = %d", factorial));

        sc.close();
    }
}