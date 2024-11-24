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
        super.printInfo();
        System.out.printf("%-13s %-7d %-23s",
                ssn, salary, department);
    }

}
