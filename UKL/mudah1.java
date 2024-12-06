
import java.util.Scanner;

public class mudah1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarak1 = 10;
        int jarak2 = 50;

        int harga1 = 4250;
        int harga2 = 5000;
        int hargaLebih50 = 6000;
        int hargaVolume = 50000;
        int volumeMinimum = 100;

        System.out.println("Masukkan berat paket Anda:");
        int berat = input.nextInt();

        System.out.println("Masukkan jarak tempuh Anda:");
        int jarakTempuh = input.nextInt();

        System.out.println("Masukkan tinggi paket Anda:");
        int t = input.nextInt();

        System.out.println("Masukkan lebar paket Anda:");
        int l = input.nextInt();

        System.out.println("Masukkan panjang paket Anda:");
        int p = input.nextInt();

        int hasilVolume = p * l * t;
        int hasilFinal = 0;

        if (jarakTempuh <= jarak1) {
            hasilFinal = harga1 * berat;
        } else if (jarakTempuh > jarak1) {
            hasilFinal = harga2 * berat;
        } else {
            hasilFinal = hargaLebih50 * berat;
        }

        if (hasilVolume > volumeMinimum) {
            hasilFinal += hargaVolume;
        }

        System.out.println("Biaya yang harus dibayar: " + hasilFinal);
    }
}
