import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz (tek sayı olmalı): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Lütfen tek sayı giriniz!");
            return;
        }

        int space = n / 2;
        int star = 1;

        // Üst kısmı çiz
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
            space--;
            star += 2;
        }

        space = 1;
        star = n - 2;

        // Alt kısmı çiz
        for (int i = 1; i <= n - 2; i += 2) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
            space++;
            star -= 2;
        }
    }
}
