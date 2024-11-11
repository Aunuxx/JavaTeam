package capstone;
// CollegeEmployee descends from Person.
// A CollegeEmployee also includes a Social Security number, an annual salary, and a department name
// as well as methods that override the Person methods to accept and display all CollegeEmployee data.

import java.util.Scanner;

public class CollegeEmployee extends Person {

    private int ssn;
    private int salary;
    private String department;

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


        System.out.print("Social Security number: ");
        uIn = scnr.next();
        ssn = Integer.valueOf(uIn);

        System.out.print("Salary: ");
        uIn = scnr.next();
        salary = Integer.valueOf(uIn);
        
        System.out.print("Department: ");
        uIn = scnr.next();
        department = uIn;

        scnr.close();
    }

    public void printInfo() {
        System.out.printf("%s %s %s %d %d %d %d %s%n",
            fname, lname, addr, zip, phoneNumber, ssn, salary, department);
    }

}