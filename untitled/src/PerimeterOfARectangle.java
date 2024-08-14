import java.util.Scanner;

public class PerimeterOfARectangle {
    static void perimeter(int length,int width){
        int perimeter = 2*(length+width);
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }

      public static void main(String[] args) {
          Scanner st = new Scanner(System.in);

          System.out.println("Enter the breadth of the triangle:");
          int b = st.nextInt();

          System.out.println("Enter the length of the rectangle");
          int l = st.nextInt();

          perimeter(b,l);
      }
}
