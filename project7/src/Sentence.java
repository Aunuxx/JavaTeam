// Sentence: This file contains the class Sentence.
    // It contains the following private data member:
        // String theSentence – storage for a single sentence.
    // It contains the following methods:
        // Sentence(String inputSentence) – a one element (one parameter) constructor. It simply
        // sets theSentence with the in-coming sentence.
        // void print(String theText) – This method simply prints theSentence.

public class Sentence {
    private String theSentence;

    public Sentence(String inputSentence) {
        theSentence = inputSentence;
    }

    public void print() {
        System.out.println(theSentence);
    }

}
