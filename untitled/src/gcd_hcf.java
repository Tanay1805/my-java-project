import java.util.Scanner;

public class gcd_hcf {
    static int GCD (int x , int y) {
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        if (x == y)
            return x;

        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);

    }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter number1:");
        int x = st.nextInt();

        System.out.println("Enter number2:");
        int y = st.nextInt();

        System.out.println("The hcf or the gcd is "+GCD(x,y));
    }
}

