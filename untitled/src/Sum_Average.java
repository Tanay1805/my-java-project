public class Sum_Average {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        // Calculate the sum of numbers from 1 to 10
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Calculate the average
        int average = sum / num;

        // Print the results
        System.out.println("The Sum of numbers from 1 to 10 is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}
