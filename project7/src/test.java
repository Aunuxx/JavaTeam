import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Composition test = new Composition();
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        test.addAParagraph();
        test.addASentence(input);
        test.print();
    }
}
