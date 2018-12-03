package Text;

import Avto.InvalidParamException;

public class Text {

    private Sentence[] sentences;

    public Text() {
    }

    public Text(Sentence[] sentences) throws InvalidParamException {
        if (sentences == null) {
            throw new InvalidParamException();
        }
        this.sentences = sentences;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        if (sentences == null) {
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.sentences = sentences;
    }

    public String makeText() {
        String text = "";
        for (int i = 0; i < sentences.length; i++) {
            text += sentences [i].makeSentence() + '\n';
        }
        return text;
    }

    @Override
    public String toString() {
        return "Text" + '\n' + '{' + makeText() +  '}';
    }
}
