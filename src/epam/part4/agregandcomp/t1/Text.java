package epam.part4.agregandcomp.t1;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> textTitle,text;

    public ArrayList<Sentence> getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(ArrayList<Sentence> textTitle) {
        this.textTitle = textTitle;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    public Text(ArrayList<Sentence> textTitle, ArrayList<Sentence> text) {
        this.textTitle = textTitle;
        this.text = text;
    }
    public void showTitle(){
        for (Sentence sentence : textTitle) {
            System.out.println(sentence);
        }
    }
    public void append(Sentence sentence){
        text.add(sentence);
    }
    public void append(Sentence[] sentences){
        for (Sentence sentence : sentences) {
            append(sentence);
        }
    }
    public void append(ArrayList<Sentence> sentences){
        text.addAll(sentences);
    }

    public void printText(){
        for (Sentence sentence : text) {
            System.out.println(sentence);
        }
    }
}
