package com.epam.textprocessing.entity;

public class Word implements SentencePart {
    private String word;

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
}
