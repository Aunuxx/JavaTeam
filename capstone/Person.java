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
    protected int phoneNumber;


    public Person() {
        fname = null;
        lname = null;
        addr = null;
        zip = -1;
        phoneNumber = -1;
    }


    public void input() {
        Scanner scnr = new Scanner(System.in);
        dialogBox("test");

        scnr.close();
    }
    private void dialogBox(String inside) {
        System.out.println("+------------------+");
        System.out.println("|                  |");
        System.out.printf("|%18.18s|",inside);
        System.out.println("|                  |");
        System.out.println("+------------------+");
    }

    public void printInfo() {
        System.out.printf("%s, %s %s %d %d", lname, fname, addr, zip, phoneNumber);
    }

}
