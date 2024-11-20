package capstone;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Person Class Input Test");
        Person test = new Person();
        test.input();

        System.out.println("CollegeEmployee Class Input Test");
        CollegeEmployee test2 = new CollegeEmployee();
        test2.input();

        System.out.println("Faculty Class Input Test");
        Faculty test3 = new Faculty();
        test3.input();

        System.out.println("Student Class Input Test");
        Student test4 = new Student();
        test4.input();


        System.out.println("Output for Person Class:");
        test.printInfo();

        System.out.println("Output for CollegeEmployee Class:");
        test2.printInfo();

        System.out.println("Output for Faculty Class:");
        test3.printInfo();

        System.out.println("Output for Student Class:");
        test4.printInfo();

        scnr.close();
    }
}
