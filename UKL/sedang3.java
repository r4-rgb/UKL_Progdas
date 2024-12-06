
import java.util.Random;
import java.util.Scanner;

public class sedang3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int bil1 = random.nextInt(10);
            int bil2 = random.nextInt(9) + 1;
            int jenisOperator = random.nextInt(5);
            String operator = "";
            double jawabanBenar = 0;

            if (jenisOperator == 0) {
                operator = "*";
                jawabanBenar = bil1 * bil2;
            } else if (jenisOperator == 1) {
                operator = "/";
                jawabanBenar = bil1 / bil2;
            } else if (jenisOperator == 2) {
                operator = "%";
                jawabanBenar = bil1 % bil2;
            } else if (jenisOperator == 3) {
                operator = "+";
                jawabanBenar = bil1 + bil2;
            } else if (jenisOperator == 4) {
                operator = "-";
                jawabanBenar = bil1 - bil2;
            }

            System.out.println(bil1 + " " + operator + " " + bil2 + " =");
            System.out.print("Masukkan jawaban Anda: ");

            int jawabanUser = scanner.nextInt();

            //cek jawaban
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah.");
                System.out.println("Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.println("Jika ingin keluar ketik 'exit'. ");
            System.out.println("Ketik apapun untuk melanjutkan permainan.");
            String pilihanLanjut = scanner.next();
            if (pilihanLanjut.equals("exit")) {
                break;
            }
        }

        System.out.println("Terima kasih telah bermain!");
    }
}
