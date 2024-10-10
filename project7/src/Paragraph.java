// Paragraph: This file contains the class Paragraph.
    // It contains the following private data member:
        // ArrayList of Sentences – a list of all the sentences in this Paragraph.
    // It contains the following methods:
        // There is no constructor – the default constructors will be sufficient.
        // void addASentence(String theText) – This method adds a Sentence to the ArrayList of Sentences.
        // void print() – calls print() for every Sentence in the ArrayList of Sentences.

import java.util.List;
import java.util.ArrayList;

public class Paragraph {
    private List<Sentence> sentences = new ArrayList<>();

    public void addASentence(String theText) {
        Sentence tmp = new Sentence(theText);
        sentences.add(tmp);
    }

    public void print() {
        for (int i = 0; i < sentences.size(); i++) {
            System.out.printf("%s ", sentences.get(i));
        }
        System.out.println();
    }

}
