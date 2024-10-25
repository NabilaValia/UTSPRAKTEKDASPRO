import java.util.Scanner;

public class ManajemenNilaiSiswa11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahSiswa = 0;
        double totalNilai = 0;
        int jumlahDiAtasRata = 0;
        int jumlahDiBawahRata = 0;

        while (true) {
            System.out.print("Masukkan nama siswa (ketik 'selesai' untuk berhenti): ");
            String nama = scanner.nextLine();
            
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai untuk " + nama + ": ");
            double nilai = scanner.nextDouble();
            scanner.nextLine(); 

            totalNilai += nilai;
            jumlahSiswa++;

            double rataRata = totalNilai / jumlahSiswa;

            if (nilai > rataRata) {
                jumlahDiAtasRata++;
            } else if (nilai < rataRata) {
                jumlahDiBawahRata++;
            }
        }

        if (jumlahSiswa > 0) {
            double rataRataAkhir = totalNilai / jumlahSiswa;

            System.out.println("\n===== Laporan Nilai Siswa =====");
            System.out.println("Rata-rata nilai kelas: " + rataRataAkhir);
            System.out.println("Jumlah siswa di atas rata-rata: " + jumlahDiAtasRata);
            System.out.println("Jumlah siswa di bawah rata-rata: " + jumlahDiBawahRata);

            boolean mayoritasDiAtasRata = jumlahDiAtasRata > (jumlahSiswa / 2);
            System.out.println("Mayoritas siswa di atas rata-rata? " +
                    (mayoritasDiAtasRata ? "Ya" : "Tidak"));
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }

        scanner.close();
    }
}
