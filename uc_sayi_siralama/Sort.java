import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int num2 = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int num3 = scanner.nextInt();

        int[] numbers = { num1, num2, num3 };
        Arrays.sort(numbers);

        System.out.println("Küçükten büyüğe sıralanmış sayılar: ");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}
