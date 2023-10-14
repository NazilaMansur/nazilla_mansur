package days_of_coding;
public class DifferentSimpleOperatorsExample {
    public static void main(String[] args) {
        // Operator Aritmatika
        int operand1 = 20;
        int operand2 = 4;
        int additionResult = operand1 + operand2;
        int subtractionResult = operand1 - operand2;
        int multiplicationResult = operand1 * operand2;
        int divisionResult = operand1 / operand2;
        int moduloResult = operand1 % operand2;

        System.out.println("Hasil Penjumlahan: " + additionResult);
        System.out.println("Hasil Pengurangan: " + subtractionResult);
        System.out.println("Hasil Perkalian: " + multiplicationResult);
        System.out.println("Hasil Pembagian: " + divisionResult);
        System.out.println("Sisa Bagi: " + moduloResult);

        // Operator Penugasan
        int num1 = 30;
        num1 += 8; // num1 = num1 + 8;
        int num2 = 15;
        num2 -= 7; // num2 = num2 - 7;
        int num3 = 12;
        num3 *= 3; // num3 = num3 * 3;

        System.out.println("Nilai num1 setelah ditambah 8: " + num1);
        System.out.println("Nilai num2 setelah dikurangi 7: " + num2);
        System.out.println("Nilai num3 setelah dikalikan 3: " + num3);

        // Operator Logika
        boolean trueValue = true;
        boolean falseValue = false;

        boolean andResult = trueValue && falseValue; // Operator AND
        boolean orResult = trueValue || falseValue;  // Operator OR
        boolean notTrueValue = !trueValue;           // Operator NOT

        System.out.println("Hasil trueValue && falseValue: " + andResult);
        System.out.println("Hasil trueValue || falseValue: " + orResult);
        System.out.println("Hasil !trueValue: " + notTrueValue);
    }
}
