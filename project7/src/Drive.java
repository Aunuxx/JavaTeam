// Driver: This file is the test driver. It contains main(), which drives the creation of the menu as well as collecting the user’s choice.
// It creates one instance of the Composition class and ONLY interfaces with it (only uses the accessing
// methods which have been made public in Composition). It does not need to know anything about the
// Paragraph or Sentence classes. In fact, if there were references to those classes, it would be a mistake.


public class Drive {

    public static void main(String[] args) {
        Composition comp = new Composition();
        comp.addAParagraph();
        comp.addASentence("test");
        
    }


}
