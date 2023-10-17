package Days.of.coding;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int day = scanner.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Minggu";
                break;
            case 2:
                dayName = "Senin";
                break;
            case 3:
                dayName = "Selasa";
                break;
            case 4:
                dayName = "Rabu";
                break;
            case 5:
                dayName = "Kamis";
                break;
            case 6:
                dayName = "Jumat";
                break;
            case 7:
                dayName = "Sabtu";
                break;
            default:
                dayName = "Angka tidak valid";
        }

        System.out.println("Hari adalah: " + dayName);

        scanner.close();
    }
}
