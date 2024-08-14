import java.util.Scanner;

public class SwitchCaseMarks {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.println("Enter the marks you have received:");
        int marks = st.nextInt();
        int category;

        // Categorizing marks to avoid too many cases
        if (marks > 70) {
            category = 1;
        } else if (marks >= 60) {
            category = 2;
        } else if (marks >= 40) {
            category = 3;
        } else {
            category = 4;
        }

        // Switch statement with conditions inside cases
        switch (category) {
            case 1:
                if (marks > 70) {
                    System.out.println("You received an A grade");
                }
                break;
            case 2:
                if (marks >= 60 && marks <= 70) {
                    System.out.println("You received a B grade");
                }
                break;
            case 3:
                if (marks >= 40 && marks < 60) {
                    System.out.println("You received a C grade");
                }
                break;
            case 4:
                if (marks < 40) {
                    System.out.println("You have failed");
                }
                break;
            default:
                System.out.println("Invalid marks");
        }
    }
}
