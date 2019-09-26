package epam.part4.agregandcomp.t1;

import java.util.ArrayList;

public class TestText {
    public static void main(String[] args) {
        ArrayList<Sentence> sentences = new ArrayList<>();
        sentences.add(new Sentence(new Word[]{
                new Word("Gold"),
                new Word(("Fish"))
        }));
        Text text = new Text(sentences,new ArrayList<>());
        text.append(new Sentence(new Word[]{
                new Word("Hello"),
                new Word("World")
        }));
        text.showTitle();
        text.printText();
    }
}
