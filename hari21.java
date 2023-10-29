package days.of.coding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa usiamu? ");
        int usia = scanner.nextInt();

        if (usia >= 17) {
            System.out.println("Anda memenuhi syarat untuk mendapatkan SIM.");
        } else {
            System.out.println("Anda belum memenuhi syarat untuk mendapatkan SIM.");
        }
    }
}
