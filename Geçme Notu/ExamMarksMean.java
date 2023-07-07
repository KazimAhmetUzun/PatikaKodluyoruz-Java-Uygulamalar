import java.util.Scanner;

public class ExamMarksMean {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] lessons = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
            int passingGrade = 55;

            double total = 0;
            int lessonsCount = 0;

            for (String lesson : lessons) {
                System.out.print(lesson + " notunu girin: ");
                int note = scanner.nextInt();

                if (note >= 0 && note <= 100) {
                    total += note;
                    lessonsCount++;
                }
            }

            if (lessonsCount > 0) {
                double mean = total / lessonsCount;

                System.out.println("Ortalama: " + mean);

                if (mean >= passingGrade) {
                    System.out.println("Dersleri geçtiniz!");
                } else {
                    System.out.println("Dersleri geçemediniz!");
                }
            } else {
                System.out.println("Girilen notlar geçerli değil, ortalama hesaplanamadı.");
            }
        }
    }
}
