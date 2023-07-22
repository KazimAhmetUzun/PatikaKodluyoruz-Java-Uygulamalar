import java.util.Scanner;

public class RecursiveNumberOperation {

    static void numberOperation(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            numberOperation(n - 5);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("N Sayısı: ");
        n = scanner.nextInt();

        numberOperation(n);

        scanner.close();
    }
}
