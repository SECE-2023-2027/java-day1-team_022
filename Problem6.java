public class Problem6 {
    public static void main(String[] args) {
        int decimalNumber = 15;
        String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Input a decimal number: " + decimalNumber);
        System.out.println("Hexadecimal number is : " + hexNumber);
    }
}
