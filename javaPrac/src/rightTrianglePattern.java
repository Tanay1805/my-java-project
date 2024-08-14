import java.util.Scanner;

public class rightTrianglePattern {
   public static void StarRightAngle(int n){
       int a , b;
       for(a=0;a<=n;a++){
           for(b=0;b<=a;b++){
               System.out.print("* ");
           }
           System.out.println(" ");
       }
   }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the number of iterations you want");
        int n = st.nextInt();

        StarRightAngle(n);
    }
}
