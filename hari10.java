package days.of.coding;
import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan golongan (I/II/III): ");
        String golongan = input.nextLine();
        System.out.print("Masukkan lama kerja (dalam tahun): ");
        int lamaKerja = input.nextInt();

        double gaji = 0;

        if (golongan.equals("I")) {
            gaji = 4000000;
        } else if (golongan.equals("II")) {
            gaji = 7000000;
        } else if (golongan.equals("III")) {
            gaji = 10000000;
        } else {
            System.out.println("Golongan tidak valid.");
            return;
        }

        if (lamaKerja > 5) {
            double bonus = 100000 * (lamaKerja - 5);
            gaji += bonus;
        }

        System.out.println("Gaji karyawan: Rp " + gaji);
    }
}
