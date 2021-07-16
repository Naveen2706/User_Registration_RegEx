import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public boolean lastNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public boolean emailValidation(String email) {
        return Pattern.matches("^[a-zA-Z0-9-.+]+@[a-zA-Z0-9.]+$", email);
    }

    public boolean mobileValidation(String phone) {
        return Pattern.matches("^[0-9]{3} [a-zA-Z0-9]{10}$", phone);
    }

    public boolean passwordVal(String password) {
        return Pattern.matches("^[A-Za-z0-9]{8,}$", password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration person = new UserRegistration();

//        String firstName = scanner.nextLine();
//        String lastName = scanner.nextLine();
//        String phone = scanner.nextLine();
        String password = scanner.nextLine();

        System.out.println("Welcome to User Registration Program");
        System.out.println(person.passwordVal(password));
    }
}

