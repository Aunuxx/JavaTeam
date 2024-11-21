package capstone;
// CollegeEmployee descends from Person.
// A CollegeEmployee also includes a Social Security number, an annual salary, and a department name
// as well as methods that override the Person methods to accept and display all CollegeEmployee data.

import java.util.Scanner;


public class CollegeEmployee extends Person {

    protected String ssn;
    protected int salary;
    protected String department;

    @Override
    public void input() {
        super.input();
        String uIn;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Social Security number: ");
        uIn = scnr.next();
        ssn = uIn;

        System.out.print("Salary: ");
        uIn = scnr.next();
        salary = Integer.valueOf(uIn);

        System.out.print("Department: ");
        uIn = scnr.next();
        department = uIn;

    }

    public void printInfo() {
        System.out.printf("\t| %15s | %15s | %30s | %6d | %12d | %10s | %6d | %20s |%n",
                fname, lname, addr, zip, phoneNumber, ssn, salary, department);
    }

}
