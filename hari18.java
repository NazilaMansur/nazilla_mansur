package days.of.coding;

import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        // Percabangan if-else untuk menentukan apakah pengguna boleh memilih atau tidak
        if (usia >= 18) {
            System.out.println("Anda boleh memilih dalam pemilu.");
        } else {
            System.out.println("Maaf, Anda belum cukup usia untuk memilih dalam pemilu.");
        }

        // Jangan lupa untuk menutup Scanner setelah penggunaan
        scanner.close();
    }
}
