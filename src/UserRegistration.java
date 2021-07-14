import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public boolean lastNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration person = new UserRegistration();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Welcome to User Registration Program");
        System.out.println(person.firstNameValidation(lastName));
    }
}
