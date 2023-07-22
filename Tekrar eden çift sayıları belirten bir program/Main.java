import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 6, 7, 8, 5, 9, 10, 11, 12, 8, 13, 14, 15, 16, 4, 18};

        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> repeatedEvenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
                if (countMap.get(number) == 2) {
                    repeatedEvenNumbers.add(number);
                }
            }
        }

        if (repeatedEvenNumbers.isEmpty()) {
            System.out.println("Dizide tekrar eden çift sayı yok.");
        } else {
            System.out.println("Dizide tekrar eden çift sayılar:");
            for (int number : repeatedEvenNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}
