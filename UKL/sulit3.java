
import java.util.Scanner;

public class sulit3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        //menyimpan angka pengguna
        int[] array = new int[n];

        //input pengguna
        System.out.println("Masukkan elemen array (angka dari 0-9):");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] frekuensi = new int[10];

        for (int i = 0; i < array.length; i++) {
            frekuensi[array[i]]++;
        }

        for (int i = 0; i < frekuensi.length; i++) {
            if (frekuensi[i] > 0) {
                System.out.println(i + " muncul " + frekuensi[i] + " kali");
            }
        }
    }
}
