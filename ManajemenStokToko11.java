import java.util.Scanner;

public class ManajemenStokToko11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan nama barang (atau 'selesai' untuk keluar): ");
            String nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok: ");
            int jumlahStok = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan harga per unit: ");
            double hargaPerUnit = Double.parseDouble(scanner.nextLine());

            double totalNilaiStok = jumlahStok * hargaPerUnit;
            System.out.println("Total nilai stok: " + totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan barang: ");
            int permintaan = Integer.parseInt(scanner.nextLine());

            if (permintaan <= jumlahStok) {
                jumlahStok -= permintaan;
                System.out.println("Permintaan dapat dipenuhi. Stok tersisa: " + jumlahStok);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }

            System.out.println();
        }
        scanner.close();
    }
}
    

    