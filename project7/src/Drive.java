import java.util.Scanner;

public class Drive {

    public static void printMenu() {
        System.out.println("This program allows a user to enter a written composition in pieces: ");
        System.out.println("1. Enter a new sentence.");
        System.out.println("2. Start a new paragraph.");
        System.out.println("3. Print the composition.");
        System.out.println("4. Quit.");
        System.out.print("Your menu selection is: ");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Composition comp = new Composition();
        boolean done = false;

        while (!done) {
            printMenu();
            int menuChoice = scnr.nextInt();

            if (menuChoice == 1) {
                System.out.println("Type a sentence, then press ENTER;");
                scnr.nextLine();
                String sentence = scnr.nextLine();
                comp.addASentence(sentence);
            }
            else if (menuChoice == 2) {
                comp.addAParagraph();
            }
            else if (menuChoice == 3) {
                comp.print();
            }
            else if (menuChoice == 4) {
                done = true;
            }
        }
    }
}
