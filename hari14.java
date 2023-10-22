package days.of.coding;
import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan umur
        System.out.print("Berapa umur Anda? ");
        int umur = scanner.nextInt();

        // Mengecek apakah pengguna sudah cukup dewasa
        if (umur >= 18) {
            System.out.println("Anda sudah cukup dewasa.");
        } else {
            System.out.println("Anda belum cukup dewasa.");
        }
    }
}
