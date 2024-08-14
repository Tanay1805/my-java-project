import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        String result = (num1>num2) ? "Number 1 is greater" : "Number 2 is greater";
        System.out.println("The number is " +result);
    }
}