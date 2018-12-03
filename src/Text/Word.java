package Text;

import Avto.InvalidParamException;

public class Word {
    private String word;

    public Word() {
    }

    public Word(String word) throws InvalidParamException {
        if (word == null || word.isEmpty()) {
            throw new InvalidParamException();
        }
        this.word = word;
    }

    public void setWord(String word) {
        if (word == null || word.isEmpty()) {
            System.out.println("Uncorrect parameter. Field size wasn't changed");
            return;
        }
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word - " + word + ".";
    }
}
