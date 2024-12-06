
import java.util.Scanner;

public class sedang1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Massukan bilangan bulat positif");
        int angka;
        angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Input anda salah");

        } else {

            int faktorial = 1;
            for (int i = 2; i <= angka; i++) {
                faktorial *= i;

            }
            System.out.println("Faktorial: " + faktorial);
        }

    }

}
