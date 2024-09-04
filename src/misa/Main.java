package misa;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accounts accounts = new Accounts();

        
        System.out.println("Enter account details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        
        Accounts account = new Account(id, firstName, lastName, email, username, password);
        accounts.addAccount(account);

       
        accounts.viewAccounts();
        
        scanner.close(); 
    }

    private static class Account extends Accounts {

        public Account(int id, String firstName, String lastName, String email, String username, String password) {
        }
    }

    private static class Accounts {

        public Accounts() {
        }

        private void addAccount(Accounts account) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private void viewAccounts() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}

 