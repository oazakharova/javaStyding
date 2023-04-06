// Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10 - 1) + 1);
        }
        System.out.println(list);
        findMinMaxAndAvg(list);
    }

    public static void findMinMaxAndAvg(List<Integer> list) {
        int sum = 0;
        for (int el : list) {
            sum += el;
        }
        System.out.println("MIN: " + Collections.min(list));
        System.out.println("MAX: " + Collections.max(list));
        System.out.println("AVG: " + (double) sum / list.size());
    }
}