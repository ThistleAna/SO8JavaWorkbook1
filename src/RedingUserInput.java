// Reading user input string
// 1. Import Scanner function
import java.util.Scanner;
public class RedingUserInput {
    public static void main(String[] args) {
        // 2. create scanner object
        Scanner reader = new Scanner(System.in);
        // prompt the user to enter their username
        System.out.println("Enter username : ");
        // 3. read the actual input, use .nextLine() to read text
        String userName = reader.nextLine();

        System.out.println("Enter your password :");
        int userPassword = reader.nextInt(); // use .nextInt() to read whole numbers

        System.out.println("Your user name is : " + userName);
        System.out.println("Your password is : " + userPassword);

    }
}
