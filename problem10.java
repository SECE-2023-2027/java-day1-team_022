import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = input.nextLine();
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println("Reverse string: " + reverse);
        input.close();
    }
}
