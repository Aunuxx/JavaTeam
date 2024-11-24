// Student descends from Person.
// In addition to the fields available in Person,
// a Student contains a major field of study and a grade point
// average as well as methods that override the Person methods
// to accept and display these additional facts.




package capstone;

import java.util.Scanner;

public class Student extends Person {
    protected String major;
    protected double gpa;

    public void input() {
        Scanner scnr = new Scanner(System.in);
        String uIn;

        super.input();


        System.out.print("Major: ");
        uIn = scnr.nextLine();
        major = uIn;

        System.out.print("GPA: ");
        uIn = scnr.next();
        gpa = Double.valueOf(uIn);


    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("%-32s %-4.2f%n",
                major, gpa);
    }
}
