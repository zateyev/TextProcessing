package com.epam.textprocessing.entity;

public class Symbol implements Lexeme {
    private Character punctuation;

    public Symbol() {
    }

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

    @Override
    public void setPart(String string) {
        this.punctuation = string.charAt(0);
    }
}
