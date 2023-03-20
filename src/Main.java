import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans three whole numbers.
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());

            // Prints entered numbers.
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println("Enter whole number.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }
    }
}
