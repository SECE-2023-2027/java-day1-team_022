import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int first = input.nextInt();

        System.out.print("Input the second number: ");
        int second = input.nextInt();

        System.out.print("Input the third number : ");
        int third = input.nextInt();

        boolean result = first % 10 == second % 10
                || first % 10 == third % 10
                || second % 10 == third % 10;

        System.out.println("The result is: " + result);
        input.close();
    }
}
