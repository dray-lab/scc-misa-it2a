package misa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Account> accounts = new ArrayList<>();
            List<Grade> grades = new ArrayList<>();
            List<Product> products = new ArrayList<>();
            
            int option;
            
            do {
                // Menu Options
                System.out.println("\nMain Menu");
                System.out.println("1. Manage Accounts");
                System.out.println("2. Manage Grades");
                System.out.println("3. Manage Products");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");
                option = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                
                switch (option) {
                    case 1:
                        manageAccounts(scanner, accounts);
                        break;
                    case 2:
                        manageGrades(scanner, grades);
                        break;
                    case 3:
                        manageProducts(scanner, products);
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid selection. Try again.");
                }
            } while (option != 4);
        }
    }

    // Manage Accounts Section
    public static void manageAccounts(Scanner scanner, List<Account> accounts) {
        System.out.println("\nManage Accounts");
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
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

        Account account = new Account(id, firstName, lastName, email, username, password);
        accounts.add(account);
        System.out.println("Account added successfully!");

        System.out.println("\nAll Accounts:");
        accounts.forEach((acc) -> {
            System.out.println(acc);
        });
    }

    // Manage Grades Section
    public static void manageGrades(Scanner scanner, List<Grade> grades) {
        System.out.println("\nManage Grades");
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Full Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Math Grade: ");
            int math = scanner.nextInt();
            
            System.out.print("Science Grade: ");
            int science = scanner.nextInt();
            
            System.out.print("English Grade: ");
            int english = scanner.nextInt();
            
            System.out.print("Computer Grade: ");
            int computer = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            Grade grade = new Grade(name, math, science, english, computer);
            grades.add(grade);
        }

        System.out.println("\nAll Grades:");
        for (Grade grade : grades) {
            grade.viewGrades();
        }
    }

    // Manage Products Section
    public static void manageProducts(Scanner scanner, List<Product> products) {
        System.out.println("\nManage Products");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Stock Quantity: ");
        int stock = scanner.nextInt();
        
        System.out.print("Sold Quantity: ");
        int sold = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Product product = new Product(id, name, price, stock, sold);
        products.add(product);
        System.out.println("Product added successfully!");

        System.out.println("\nAll Products:");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-15s\n", 
            "ID", "Name", "Price", "Stocks", "Sold", "Profit", "Est. Profit", "Status");
        products.forEach((prod) -> {
            prod.viewProduct();
        });
    }

    // Account Class
    static class Account {
        int id;
        String firstName;
        String lastName;
        String email;
        String username;
        String password;

        public Account(int id, String firstName, String lastName, String email, String username, String password) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.username = username;
            this.password = password;
        }

        @Override
        public String toString() {
            return "Account [ID=" + id + ", Name=" + firstName + " " + lastName + ", Email=" + email + ", Username=" + username + "]";
        }
    }

    // Grade Class
    static class Grade {
        String name;
        int math;
        int science;
        int english;
        int computer;

        public Grade(String name, int math, int science, int english, int computer) {
            this.name = name;
            this.math = math;
            this.science = science;
            this.english = english;
            this.computer = computer;
        }

        public void viewGrades() {
            System.out.println("Student: " + name);
            System.out.println("Math: " + math);
            System.out.println("Science: " + science);
            System.out.println("English: " + english);
            System.out.println("Computer: " + computer);
            System.out.println("-------------------");
        }
    }

    // Product Class
    static class Product {
        int id;
        String name;
        double price;
        int stock;
        int sold;

        public Product(int id, String name, double price, int stock, int sold) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.sold = sold;
        }

        public void viewProduct() {
            double profit = sold * price;
            double estimatedProfit = (stock + sold) * price;
            String status = (stock > 0) ? "Available" : "Out of Stock";

            System.out.printf("%-10d %-15s %-10.2f %-10d %-10d %-10.2f %-10.2f %-15s\n",
                id, name, price, stock, sold, profit, estimatedProfit, status);
        }
    }
}
