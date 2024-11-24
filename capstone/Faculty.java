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

        super.input();

        System.out.print("Tenured: ");
        uIn = scnr.next();
        tenured = Boolean.valueOf(uIn);

    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("%b%n",
                tenured);
    }
}
