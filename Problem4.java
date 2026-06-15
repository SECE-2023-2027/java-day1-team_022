public class Problem4 {
    public static void main(String[] args) {
        String first = "100010";
        String second = "110010";

        int firstValue = Integer.parseInt(first, 2);
        int secondValue = Integer.parseInt(second, 2);
        int sumValue = firstValue + secondValue;
        String sumBinary = Integer.toBinaryString(sumValue);

        System.out.println("Input first binary number: " + first);
        System.out.println("Input second binary number: " + second);
        System.out.println("Sum of two binary numbers: " + sumBinary);
    }
}
