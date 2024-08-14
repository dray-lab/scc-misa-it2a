package misa;

import java.util.Scanner;

public class Grade {
    public void getGrade(){
        Scanner input = new Scanner(System.in);
        
        String name;
        int Math, Science, English, Computer;
        int TotalMarks;
        float Ave;
        
        
        System.out.print("\nEnter your full name: ");
        name = input.nextLine();
        System.out.println("\nEnter Marks in: ");
        System.out.print("Math:  ");
        Math = input.nextInt();
        System.out.print("Science:  ");
        Science = input.nextInt();
        System.out.print("English:  ");
        English = input.nextInt();
        System.out.print("Computer:  ");
        Computer = input.nextInt();
        
        System.out.println("------------------------------");
        System.out.println("Grade Detail");
        System.out.println("------------------------------");
        
        System.out.println("Name:"+name);
        
        TotalMarks = Math+Science+English+Computer;
        
        System.out.println("Total Marks:"+ TotalMarks);
        
        Ave = TotalMarks/4;
        
        System.out.println("Average:"+Ave);
        
         
       
    }
    
}