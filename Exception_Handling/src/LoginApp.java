import java.util.Scanner;

// Custom Exception class
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Login System class
class LoginSystem {
    private final String validUsername = "admin";
    private final String validPassword = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUsername) || !pass.equals(validPassword)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        } else {
            System.out.println("Login successful! Welcome, " + user + ".");
        }
    }
}

// Main class
public class LoginApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem login = new LoginSystem();

        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                login.validate(user, pass);
                isLoggedIn = true; // login success → exit loop
            }
            catch (InvalidCredentialsException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
