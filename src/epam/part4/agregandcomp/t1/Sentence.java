package epam.part4.agregandcomp.t1;

public class Sentence {
    private Word[] sentence;

    public Sentence(Word[] sentence) {
        this.sentence = sentence;
    }

    public Word[] getSentence() {
        return sentence;
    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("");
        for (Word word : sentence) {
            output.append(word + " ");
        }
        output.deleteCharAt(output.length() - 1);
        output.append(".");
        return output.toString();
    }
}
