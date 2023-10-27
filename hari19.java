package days.of.coding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = input.nextInt();

        if (angka > 10) {
            System.out.println(angka + " lebih besar dari 10.");
        } else {
            System.out.println(angka + " tidak lebih besar dari 10.");
        }

        input.close();
    }
}
