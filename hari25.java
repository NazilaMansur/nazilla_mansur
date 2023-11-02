package days.of.coding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // mengimput bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // memeriksa apakah bilangan genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan ini adalah genap.");
        } else {
            System.out.println("Bilangan ini adalah ganjil.");
        }
    }
}
