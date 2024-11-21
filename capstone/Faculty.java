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
        super.input();

        Scanner scnr = new Scanner(System.in);
        String uIn;

        System.out.print("Tenured: ");
        uIn = scnr.next();
        tenured = Boolean.valueOf(uIn);

    }

    public void printInfo() {
        System.out.printf("\t| %15s | %15s | %30s | %6d | %12d | %10s | %6d | %20s | %5b |%n",
                fname, lname, addr, zip, phoneNumber, ssn, salary, department, tenured);
    }
}
