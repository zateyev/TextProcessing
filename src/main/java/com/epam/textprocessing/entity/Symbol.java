package com.epam.textprocessing.entity;

public class Symbol implements SentencePart {
    private Character punctuation;

    public Symbol(Character symbol) {
        this.punctuation = symbol;
    }

    public Character getPunctuation() {
        return punctuation;
    }

    @Override
    public String toSourceString() {
        return getPunctuation().toString();
    }
}
