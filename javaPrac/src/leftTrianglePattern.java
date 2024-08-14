import java.util.Scanner;

public class leftTrianglePattern {
    public static void StarRight(int k) {
        int a, b;
        for (a = 0; a < k; a++) {
            // Adjusting spaces before the stars
            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }
            // Printing stars
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the k digit:");
        int k = st.nextInt();

        StarRight(k);
    }
}
