package days_of_coding;
import java.util.Scanner;

public class OperatorAritmetikaBedakan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Penjumlahan
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        // Pengurangan
        int hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Perkalian
        int hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        // Pembagian (dengan penanganan pembagian oleh nol)
        if (angka2 != 0) {
            double hasilPembagian = (double) angka1 / angka2;
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
        }

        // Modulus (Sisa hasil bagi)
        int hasilModulus = angka1 % angka2;
        System.out.println("Hasil Modulus: " + hasilModulus);

        input.close();
    }
}
