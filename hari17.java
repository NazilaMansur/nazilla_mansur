import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan ini adalah positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan ini adalah negatif.");
        } else {
            System.out.println("Bilangan ini adalah nol.");
        }

        input.close();
    }
}
