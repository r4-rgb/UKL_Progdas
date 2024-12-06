
import java.util.Scanner;

public class mudah3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int awal;
        int akhir;
        System.out.println("masukkan angka awal");
        awal = scanner.nextInt();
        System.out.println("masukkan angka akhir");
        akhir = scanner.nextInt();

        for (int i = awal; i >= akhir; i--) {
            System.out.print(i + ". ");

            if (i > 1) {

                if (i % 3 == 0) {
                    System.out.println("saya angkatan 33");

                } else if (i % 2 == 0) {
                    System.out.println("saya anak moklet");

                } else {
                    System.out.println("saya anak wikusama");

                }
            } else {
                System.out.println("saya senang");
            }
        }
    }
}
