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
        System.out.println("Collage Employees:");
        for (int i = 0; i < count; i++) {
            array[i].printInfo();
        }
    }
    public static void printArray(Faculty[] array, int count) {
        System.out.println("Faculty:");
        for (int i = 0; i < count; i++) {
            array[i].printInfo();
        }
    }
    public static void printArray(Student[] array, int count) {
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            array[i].printInfo();
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
                    collegeEmployees[c] = new CollegeEmployee();
                    collegeEmployees[c].input();
                    c++;
                    break;
                case "F":
                    faculties[f] = new Faculty();
                    faculties[f].input();
                    f++;
                    break;
                case "S":
                    students[s] = new Student();
                    students[s].input();
                    s++;
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
