package epam.part4.agregandcomp.t1;

public class Word {
    private String word;

    @Override
    public String toString() {
        return word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
    }
}
