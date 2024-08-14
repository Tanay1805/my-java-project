import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String input = st.nextLine();
        char character;
        char lowerChar;

        if (input.length() != 1) {
            System.out.println("Enter the Character again");
        } else {
            character = input.charAt(0);
            lowerChar = Character.toLowerCase(character);

            // Check if the character is a vowel
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                System.out.println(character + " is a vowel.");
            } else {
                System.out.println(character + " is not a vowel.");
            }
        }

        st.close();
    }
}
