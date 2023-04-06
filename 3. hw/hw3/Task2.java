// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10 - 1) + 1);
        }
        System.out.println(list);
        System.out.println(deleteEvenNumbers(list));
    }

    public static List<Integer> deleteEvenNumbers(List<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }
        return list.stream().filter(el -> el % 2 != 0).collect(Collectors.toList());
    }
}