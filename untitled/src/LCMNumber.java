import java.util.Scanner;

public class LCMNumber {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = st.nextInt();

        System.out.println(("Enter the second number:"));
        int num2 = st.nextInt();

        int result =  (num1>num2) ? num1:num2;

        while(true){
            if(result%num1==0 && result%num2==0){
                break;
            }
            result++;
        }
        System.out.println("LCM of " + num1 + " and " + num2
                + " : " + result);
    }
}
