package Text;

import Avto.InvalidParamException;

public class Sentence {

    private Word[] words;

    public Sentence() {
    }

    public Sentence(Word[] words) throws InvalidParamException {
        if (words == null){
            throw new InvalidParamException();
        }
        this.words = words;
    }

    public void setWords(Word[] words) {
        if (words == null){
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public String makeSentence() {
        String sent = "";
        for (int i = 0; i < words.length; i++) {
            sent += words [i].getWord() + " ";
        }
        return sent;
    }
}

