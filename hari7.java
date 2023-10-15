package days_of_coding;

public class Day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak valid");
        } else if (usia < 18) {
            System.out.println("Anda masih di bawah umur");
        } else if (usia < 65) {
            System.out.println("Anda dewasa");
        } else {
            System.out.println("Anda seorang senior");
        }
    }
}
