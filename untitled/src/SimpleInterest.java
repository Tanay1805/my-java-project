import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter your principal amount:");
        int principal = st.nextInt();

        System.out.println("Enter your rate of interest:");
        float rate = st.nextFloat();

        System.out.println("Enter your Time Duration in years:");
        int years = st.nextInt();

        float SimpleInterest = (principal*rate*years)/100;
        System.out.println("The simple interest is  "+ SimpleInterest );
        System.out.println("The total amount to be paid is " + SimpleInterest+principal);

    }
}
