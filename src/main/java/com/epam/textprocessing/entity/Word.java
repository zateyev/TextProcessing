package com.epam.textprocessing.entity;

public class Word implements Lexeme {
    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toSourceString() {
        return getWord();
    }

    @Override
    public void setPart(String string) {
        this.word = string;
    }
}
