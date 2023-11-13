package days.of.coding;

import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        // membuat Array List
        ArrayList<Integer> numbers = new ArrayList<>();

        // menambahkan elemen
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // menampilkan elemen"
        System.out.println("Elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // ukuran
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // untuk menghapus
        numbers.remove(Integer.valueOf(20));

        // menampilkan setelah di hapus
        System.out.println("Elements in the ArrayList after removal:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
