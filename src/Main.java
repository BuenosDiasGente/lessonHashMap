import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println(" ");

        List<Integer> number = new ArrayList<>(List.of(10, 1, 2, 7, 4, 4, 5, 5, 6, 7));
        task2(number);
        System.out.println(" ");

        List<String> text = new ArrayList<>(List.of("What ", "do", "you", "do"));
        task3(text);
        System.out.println(" ");

        List<String> words = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три", "четыре"));
        task4(words);

    }

    public static void task1(List<Integer> nums) {
        System.out.println("task1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }

    }

    public static void task2(List<Integer> number) {
        System.out.println("task2");
        for (int i = 0; i < number.size(); i++) {
            number.sort(null);
            if (number.get(i) % 2 == 0) {
                Set<Integer> list = new HashSet<>();
                list.add(number.get(i));
                System.out.println(list);
            }
        }
    }

    public static void task3(List<String> text) {
        System.out.println("task3");
        Set<String> texts = new HashSet<>(text);
        List<String> number = new ArrayList<>(texts);
        System.out.println(number);
    }

    public static void task4(List<String> words) {
        System.out.println("task4");

        Map<String, Integer> result = new HashMap<>();
        int count = 1;
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, count);
            }
        }
        System.out.println(result);

    }

}




















