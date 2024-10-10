// Composition: This file contains the class Composition.
    // It contains the following private data members:
        // ArrayList of Paragraphs – a list of all the paragraphs in the Composition.
        // Int currentParagraph – This is a simple demo program, so this attribute only tracks the most recently created paragraph.
    // It contains the following methods:
        // void addAParagraph() – This method simply instantiates a new Paragraph and adds it to the Paragraphs ArrayList. It also bumps the currentParagraph index.
        // void addASentence(String aSentence) – this method calls addASentence(String aSentence) for the current Paragraph in the Paragraph ArrayList.
        // void print() – This method prints a blank line to separate the printing from the menu.
        //  Then, it calls the print method for each of the Paragraphs in the Paragraph ArrayList. A blank line is introduced after each Paragraph is printed.

import java.util.List;
import java.util.ArrayList;

public class Composition {
    private List<String> paragraphs = new ArrayList<>();
    private int currentParagraph = 0;


    public void addAParagraph() {
        paragraphs.add("");
        currentParagraph++;
    }
    
    public void addASentence(String aSentence) {
        paragraphs.set(currentParagraph, paragraphs.get(currentParagraph) + " " + aSentence);
    }


}
