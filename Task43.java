import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");

        try {
            int index = sc.nextInt();
            System.out.println("Day is: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        sc.close();
    }
}
