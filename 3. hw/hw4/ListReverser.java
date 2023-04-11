import java.util.LinkedList;

public class ListReverser {
    public static LinkedList<Object> reverse(LinkedList<Object> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LinkedList<Object> reversedList = new LinkedList<>();
        while (list.iterator().hasNext()) {
            reversedList.offerFirst(list.pollFirst());
        }
        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(reverse(list));
    }
}
