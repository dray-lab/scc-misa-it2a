package misa;

public class Grade {
    String name;
    int math;
    int science;
    int english;
    int computer;
    int totalMarks;
    float average;

    
    public Grade(String name, int math, int science, int english, int computer) {
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
        this.computer = computer;
        this.totalMarks = math + science + english + computer;
        this.average = totalMarks / 4.0f;
    }

    public Grade(int id, String name, double prelim, double midterm, double preFinal, double finalExam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void viewGrades() {
        System.out.println("------------------------------");
        System.out.println("Grade Details");
        System.out.println("------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Computer: " + computer);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average);
        System.out.println("------------------------------");
    }
}
