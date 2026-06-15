import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        input.close();
    }
}
