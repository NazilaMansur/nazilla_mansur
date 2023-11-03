packagen days.of.coding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih salah satu hari dalam seminggu (1-7): ");
        int day = input.nextInt();

        String namaHari;

        if (day == 1) {
            namaHari = "Minggu";
        } else if (day == 2) {
            namaHari = "Senin";
        } else if (day == 3) {
            namaHari = "Selasa";
        } else if (day == 4) {
            namaHari = "Rabu";
        } else if (day == 5) {
            namaHari = "Kamis";
        } else if (day == 6) {
            namaHari = "Jumat";
        } else if (day == 7) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Hari tidak valid";
        }

        System.out.println("Hari ini adalah " + namaHari);

        input.close();
    }
}
