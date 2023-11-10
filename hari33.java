package days.of.coding;

import java.util.Scanner;

public class SimplePrideMasterClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        String pesan = "";
        boolean sudahAdaPesan = false;

        if (angka % 3 == 0) {
            pesan += "Pride of 3";
            sudahAdaPesan = true;
        }

        if (angka % 5 == 0) {
            pesan += (sudahAdaPesan ? " " : "") + "Pride of 5";
            sudahAdaPesan = true;
        }

        System.out.println(sudahAdaPesan ? pesan : "Angka tidak habis dibagi 3 atau 5");

        scanner.close();
    }
}
