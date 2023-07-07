import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String truePassword = "kazim61"; // Doğru şifre burada tanımlanmıştır

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Şifrenizi girin: ");
            String enterPassword = scanner.nextLine();

            if (enterPassword.equals(truePassword)) {
                System.out.println("Giriş başarılı.");
            } else {
                System.out.print("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
                String passwordResetChoose = scanner.nextLine();

                if (passwordResetChoose.equalsIgnoreCase("Evet")) {
                    System.out.print("Yeni şifreyi girin: ");
                    String newPassword = scanner.nextLine();

                    if (newPassword.equals(enterPassword)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre girin.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else {
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                }
            }
        }
    }
}
