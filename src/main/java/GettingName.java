import java.util.Scanner;

public class GettingName {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the amount of names: ");
        int namesLength = scr.nextInt();
        scr.nextLine();

        String[] names = new String[namesLength];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the " + (i + 1) + " name: ");
            names[i] = scr.nextLine();
        }
        scr.close();

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + " name: " + names[i]);
        }

        scr.close();
    }
}