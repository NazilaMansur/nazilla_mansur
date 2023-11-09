package days.of.coding

import java.util.Scanner;

public class Contohpercabangan sederhana {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // masukkan nilai ujian
        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = scanner.nextInt();

        // memeriksa apakah nilai ujian cukup untuk lulus
        if (nilaiUjian >= 70) {
            System.out.println("Anda lulus ujian.");

            // masukkan jumlah kehadiran
            System.out.print("Masukkan jumlah kehadiran: ");
            int jumlahKehadiran = scanner.nextInt();

            // periksa jumlah kehadiran
            if (jumlahKehadiran >= 75) {
                System.out.println("Anda memiliki tingkat kehadiran yang baik.");
            } else {
                System.out.println("Namun, Anda perlu meningkatkan kehadiran.");
            }
        } else {
            System.out.println("Anda tidak lulus ujian.");
        }

        // penutup
        scanner.close();
    }
}
