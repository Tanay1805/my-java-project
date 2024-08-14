import java.util.Scanner;

public class PrintOddNums {
    public static void main(String[]args){

        int num = 20;
        for(int i=0;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
