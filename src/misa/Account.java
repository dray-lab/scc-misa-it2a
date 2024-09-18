package misa;

public class Account {

    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String username;
    public String password;

    public Account(int id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password does not meet the required criteria.");
        }
    }

    public final boolean isValidPassword(String password) {
    
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
            return false;
        }
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            System.out.println("Error: Password must contain at least one uppercase and one lowercase letter.");
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Error: Password must contain at least one number.");
            return false;
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("Error: Password must contain at least one special character.");
            return false;
        }
        if (password.equalsIgnoreCase("admin") || password.equalsIgnoreCase("password") || password.equals("1234")) {
            System.out.println("Error: Password must not be a common password like 'admin', 'password', or '1234'.");
            return false;
        }
        return true; // If all checks pass, the password is valid
    }
}

