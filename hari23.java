package days.of.coding;

import java.util.Scanner;

public class PercabanganSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        double angka = input.nextDouble();

        if (angka > 0) {
            System.out.println("Angka ini adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka ini adalah negatif.");
        } else {
            System.out.println("Angka ini adalah nol.");
        }

        input.close();
    }
}
