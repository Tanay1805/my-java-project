import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the principal rate:");
        int principal_amount = st.nextInt();

        System.out.println("Enter the rate:");
        float rate = st.nextFloat();

        System.out.println("Enter the Time duration:");
        int time = st.nextInt();

        double cmp_interest = principal_amount * (Math.pow((1 + rate / 100), time));

        System.out.println("The compound interest is "+ cmp_interest);
        System.out.println("The total compound interest is: "+cmp_interest+principal_amount);
    }
}
