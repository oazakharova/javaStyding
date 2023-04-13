import java.util.*;
import java.util.stream.Collectors;

public class NameAnalyser {
    public static void main(String[] args) {
        String employeeString = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        List<String> employees = new ArrayList<>(Arrays.asList(employeeString.split("\n")));
        analyse(employees);
    }

    public static void analyse(List<String> employees) {
        Map<String, Integer> namesMap = employees.stream().map(e -> Arrays.stream(e.split(" ")).findFirst().get())
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        namesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}