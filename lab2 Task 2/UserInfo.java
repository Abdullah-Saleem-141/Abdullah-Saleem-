import java.util.Scanner;

class UserInfo {
    // Static username and password
    static String Username = "Abdullah Saleem";
    static String Password = "Abdullah";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Checking username and password
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Your password is correct.");
        } else {
            System.out.println("Incorrect password.");
        }
        
        scanner.close();
    }
}
