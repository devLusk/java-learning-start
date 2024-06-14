import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scr.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");
        }

        scr.close();
    }
}
