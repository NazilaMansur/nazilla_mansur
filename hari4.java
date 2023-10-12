package days.of.coding;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String makanan, minuman, hobi;
        int usia;
       

        System.out.print("Masukkan Makanan Favorit Anda: ");
        makanan = scan.nextLine();

        System.out.print("Masukkan Minuman Favorit Anda: ");
        minuman = scan.nextLine();

        System.out.print("Masukkan Hobi Anda: ");
        hobi = scan.nextLine();

        System.out.print("Berapa Usia Anda: ");
        usia = scan.nextInt();

        
        System.out.println("===============================================");
        System.out.println("Makanan Favorit Anda: " + makanan);
        System.out.println("Minuman Favorit Anda: " + minuman);
        System.out.println("Hobi Anda: " + hobi);
        System.out.println("Usia Anda: " + usia + " tahun");
        
    }
}
