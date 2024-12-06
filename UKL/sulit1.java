
import java.util.Scanner;

public class sulit1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahsiswa;
        System.out.println("Masukkan jumlah siswa");
        jumlahsiswa = scanner.nextInt();
        int totalnilai = 0;
        int nilai;

        for (int i = 1; i <= jumlahsiswa; i++) {

            System.out.println("Nilai siswa ke " + i);
            nilai = scanner.nextInt();
            totalnilai += nilai;
        }

        int rataRata = totalnilai / jumlahsiswa;
        System.out.println("Rata-rata nilai siswa adalah " + rataRata);
        System.out.println("Total nilai adalah " + totalnilai);

    }
}
