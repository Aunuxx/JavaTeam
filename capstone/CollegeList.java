package capstone;

import java.util.Scanner;

public class CollegeList {
    final static int CSIZE = 4; // For limits on data
    final static int FSIZE = 3;
    final static int SSIZE = 7;

    static CollegeEmployee[] collegeEmployees = new CollegeEmployee[CSIZE]; // Arrays for data
    static Faculty[] faculties = new Faculty[FSIZE];
    static Student[] students = new Student[SSIZE];

    static int c = 0; // used for checking array limit
    static int f = 0;
    static int s = 0;


    public static void printArray(CollegeEmployee[] array, int count) {
        System.out.println("College Employees:");
        System.out.printf("| %-15s | %-15s | %-30s | %-6s | %-12s | %-10s | %-6s | %-20s |%n",
                "First Name", "Last Name", "Address", "ZIP", "Phone Number", "SSN", "Salary", "Department");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                array[i].printInfo();
            }
        } else {
            System.out.println("There are no college employees");
        }
    }
    public static void printArray(Faculty[] array, int count) {
        System.out.println("Faculty:");
        System.out.printf("| %-15s | %-15s | %-30s | %-6s | %-12s | %-10s | %-6s | %-20s | %-5s |%n",
                "First Name", "Last Name", "Address", "ZIP", "Phone Number", "SSN", "Salary", "Department", "Tenured");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                array[i].printInfo();
            }
        } else {
            System.out.println("There are no faculty");
        }
    }
    public static void printArray(Student[] array, int count) {
        System.out.println("Students:");
        System.out.printf("| %-15s | %-15s | %-30s | %-6s | %-12s | %-30s | %-4s |%n",
                "First Name", "Last Name", "Address", "ZIP", "Phone Number", "Major", "GPA");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                array[i].printInfo();
            }
        } else {
            System.out.println("There are no students");
        }

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Choose data type to enter");
        System.out.println("Employee, Faculty, Student, Quit");
        System.out.print("[C/F/S/Q]: ");
        String input = scnr.nextLine();

        while (!input.equals("Q")) {

            switch (input) {
                case "C":
                    try {
                        collegeEmployees[c] = new CollegeEmployee();
                        collegeEmployees[c].input();
                        c++;
                    }
                    catch (Exception ex) {
                        System.out.println("Limit reached for Employees");
                    }
                    break;
                case "F":
                    try {
                        faculties[f] = new Faculty();
                        faculties[f].input();
                        f++;
                    }
                    catch (Exception ex) {
                        System.out.println("Limit reached for Faculty");
                    }
                    break;
                case "S":
                    try {
                        students[s] = new Student();
                        students[s].input();
                        s++;
                    }
                    catch (Exception ex) {
                        System.out.println("Limit reached for Students");
                    }
                    break;

                default:
                    System.out.println("Invalid option: "+input);
                    break;
            }

            System.out.println("Choose data type to enter");
            System.out.println("Employee, Faculty, Student, Quit");
            System.out.print("[C/F/S/Q]: ");
            input = scnr.nextLine();
        }

        
            printArray(collegeEmployees, c);
            printArray(faculties, f);
            printArray(students, s);




        scnr.close();
    }

}
