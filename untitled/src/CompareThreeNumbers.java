import java.awt.*;
import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3:");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is the greatest number of three");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the greatest number of three");
        } else if (num3 > num1 && num3 > num2 ) {
            System.out.print(("Number 3 is the greatest of three"));
        }
    }
}

