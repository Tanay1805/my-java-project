import java.util.Scanner;

public class MultiplyTwoFloatingNums {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the first double number:");
        double a = st.nextDouble();

        System.out.println("Enter the second double number:");
        double b = st.nextDouble();

        double result = a*b;
        System.out.println("The answer of the Multiplication is:"+result);
    }
}
