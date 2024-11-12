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

        System.out.print("First name: ");
        uIn = scnr.next();
        fname = uIn;

        System.out.print("Last name: ");
        uIn = scnr.next();
        lname = uIn;

        System.out.print("Address: ");
        uIn = scnr.next();
        addr = uIn;

        System.out.print("Zip code: ");
        uIn = scnr.next();
        zip = Integer.valueOf(uIn);

        System.out.print("Phone number: ");
        uIn = scnr.next();
        phoneNumber = Integer.valueOf(uIn);


        System.out.print("Major: ");
        uIn = scnr.next();
        major = uIn;

        System.out.print("GPA: ");
        uIn = scnr.next();
        gpa = Double.valueOf(uIn);


        scnr.close();
    }

    public void printInfo() {
        System.out.printf("%s %s %s %d %d %s %.2f%n",
        fname, lname, addr, zip, phoneNumber, major, gpa);
    }
}
