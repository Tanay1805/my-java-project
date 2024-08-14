import java.util.Scanner;

public class isleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        boolean isLeapYear = false;


        if (year % 4 == 0) {

            if (year % 100 == 0) {
                // Check if the year is divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;  // Divisible by 400 means it is a leap year
                } else {
                    isLeapYear = false; // Divisible by 100 but not by 400 means it is not a leap year
                }
            } else {
                isLeapYear = true;  // Divisible by 4 but not by 100 means it is a leap year
            }
        } else {
            isLeapYear = false; // Not divisible by 4 means it is not a leap year
        }

        if (isLeapYear) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
