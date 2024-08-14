import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the fibonacci series:");
        int n = sc.nextInt();

        if (n<=0){
            return;
        }
        int fib[] = new int[2*n+1];
        fib[0] = 0;
        fib[1] = 1;

        int s = 0;

        for(int j=2;j<=n*2;j++){
            fib[j]=fib[j-1]+fib[j-2];
        if(j%2 == 0){
            s+= fib[j];
        }
        }
        System.out.print("The Fibonacci Series up to " + n * 2 + " terms is: ");
        for (int i = 0; i <= n * 2; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println("/n");
        System.out.println("The Fibonacci Series for "+n +" is "+ s);
    }
}
