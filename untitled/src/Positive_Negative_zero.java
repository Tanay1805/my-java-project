import java.util.Scanner;

public class Positive_Negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("Number 1 is greater than Number 2");
        } else if(num1 < num2) {
            System.out.println("Number 2 is greater than Number 1");
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}
