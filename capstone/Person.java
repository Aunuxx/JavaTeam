// A Person contains a first name, last name, street address, zip code, and phone number. 
// The class also includes a method that sets each data field, using a series of dialog boxes
// and a display method that displays all of a Person’s information on a single line at the command line on the screen.

package capstone;

import java.util.Scanner;

public class Person {
    protected String fname;
    protected String lname;
    protected String addr;
    protected int zip;
    protected long phoneNumber;


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
        scnr.nextLine();
        uIn = scnr.nextLine();
        addr = uIn;
        System.out.print("Zip code: ");
        uIn = scnr.next();
        zip = Integer.valueOf(uIn);
        System.out.print("Phone number: ");
        uIn = scnr.next();
        phoneNumber = Long.valueOf(uIn);

    }

    public void printInfo() {
        System.out.printf("%-18s %-17s %-32s %-8d %-15d",
                fname, lname, addr, zip, phoneNumber);
    }

}
