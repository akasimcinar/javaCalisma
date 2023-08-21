import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("İşlem seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bölen sıfır olamaz!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}