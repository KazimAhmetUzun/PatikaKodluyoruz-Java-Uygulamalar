import java.util.Scanner;

public class GroceryCachierProgram {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double pearPrice = 2.14;
            double applePrice = 3.67;
            double tomatoPrice = 1.11;
            double bananPrice = 0.95;
            double eggplantPrice = 5.00;

            System.out.print("Armut kaç kilo? : ");
            double pearKilo = scanner.nextDouble();

            System.out.print("Elma kaç kilo? : ");
            double appleKilo = scanner.nextDouble();

            System.out.print("Domates kaç kilo? : ");
            double tomatoKilo = scanner.nextDouble();

            System.out.print("Muz kaç kilo? : ");
            double bananaKilo = scanner.nextDouble();

            System.out.print("Patlıcan kaç kilo? : ");
            double eggpalntKilo = scanner.nextDouble();

            double toplamTutar = (pearPrice * pearKilo) +
                                 (applePrice * appleKilo) +
                                 (tomatoPrice * tomatoKilo) +
                                 (bananPrice * bananaKilo) +
                                 (eggplantPrice * eggpalntKilo);

            System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        }
    }
}
