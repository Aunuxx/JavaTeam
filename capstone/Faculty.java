// Faculty descends from CollegeEmployee.
// This class also includes a Boolean field that indicates whether
// the Faculty member is tenured, as well as methods that override
// the CollegeEmployee methods to accept and display this additional
// piece of information.


package capstone;

import java.util.Scanner;

public class Faculty extends CollegeEmployee  {
    protected boolean tenured;


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
        ssn = uIn;

        System.out.print("Salary: ");
        uIn = scnr.next();
        salary = Integer.valueOf(uIn);

        System.out.print("Department: ");
        uIn = scnr.next();
        department = uIn;

        System.out.print("Tenured: ");
        uIn = scnr.next();
        tenured = Boolean.valueOf(uIn);

        scnr.close();
    }

    public void printInfo() {
        System.out.printf("%s %s %s %d %d %d %d %s %b%n",
            fname, lname, addr, zip, phoneNumber, ssn, salary, department, tenured);
    }
}
