package misa;

import java.util.Scanner;
import misa.Grade;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade[] grades = new Grade[100];  
        int num = 0;  
        int option;

        do {
            
            System.out.println("Grades Demo App");
            System.out.println("---------------");
            System.out.println("1. Add Records");
            System.out.println("2. View Records");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1: 
                    System.out.print("Enter number of students: ");
                    num = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < num; i++) {
                        System.out.println("Enter details for student " + (i + 1) + ":");
                        System.out.print("Full Name: ");
                        String name = sc.nextLine();
                        System.out.print("Math: ");
                        int math = sc.nextInt();
                        System.out.print("Science: ");
                        int science = sc.nextInt();
                        System.out.print("English: ");
                        int english = sc.nextInt();
                        System.out.print("Computer: ");
                        int computer = sc.nextInt();
                        sc.nextLine(); 

                       
                        grades[i] = new Grade(name, math, science, english, computer);
                    }
                    break;

                case 2: 
                    for (int i = 0; i < num; i++) {
                        grades[i].viewGrades();
                        System.out.println("-------------------");
                    }
                    break;

                case 3: 
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (option != 3);

        sc.close();
    }
}
