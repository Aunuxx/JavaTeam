package capstone;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Person test = new Person();
        test.input();
        test.printInfo();
        CollegeEmployee test2 = new CollegeEmployee();
        test2.input();
        test2.printInfo();
        scnr.close();
    }
}
