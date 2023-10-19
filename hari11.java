package days.of.coding;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // Daftar menu
        Scanner input = new Scanner(System.in);
        int totalHarga = 0;

        while (true) {
            System.out.println("Menu Makanan:");
            System.out.println("1. Nasi Goreng: Rp 25000");
            System.out.println("2. Mie Goreng: Rp 20000");
            System.out.println("3. Ayam Bakar: Rp 35000");
            System.out.print("Pilih menu yang ingin dipesan (selesai untuk mengakhiri): ");

            String pesanan = input.nextLine();

            if (pesanan.equalsIgnoreCase("selesai")) {
                break;
            }

            int hargaMenu = 0;
            int minimumPesan = 0;

            if (pesanan.equalsIgnoreCase("nasi goreng")) {
                hargaMenu = 25000;
                minimumPesan = 1;
            } else if (pesanan.equalsIgnoreCase("mie goreng")) {
                hargaMenu = 20000;
                minimumPesan = 1;
            } else if (pesanan.equalsIgnoreCase("ayam bakar")) {
                hargaMenu = 35000;
                minimumPesan = 2;
            } else {
                System.out.println("Menu tidak valid. Mohon masukkan menu yang benar.");
                continue;
            }

            System.out.print("Jumlah " + pesanan + " yang ingin dipesan: ");
            int jumlah = input.nextInt();

            if (jumlah < minimumPesan) {
                System.out.println("Minimum pemesanan untuk " + pesanan + " adalah " + minimumPesan);
            } else {
                int totalHargaMenu = hargaMenu * jumlah;
                System.out.println("Total harga " + jumlah + " " + pesanan + ": Rp " + totalHargaMenu);
                totalHarga += totalHargaMenu;
            }
        }

        System.out.println("Total harga pesanan: Rp " + totalHarga);
        input.close();
    }
}
