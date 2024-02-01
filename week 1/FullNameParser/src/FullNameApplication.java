import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String userName;
        String trimName;
        String firstName;
        String middleName;
        String lastName;

        System.out.println("Please enter your full name: ");
        userName = userInput.nextLine();

        trimName = userName.trim();
    }
}
