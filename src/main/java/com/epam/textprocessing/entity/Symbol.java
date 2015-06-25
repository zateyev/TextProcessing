package com.epam.textprocessing.entity;

public class Symbol implements Lexeme {
    private Character value;

    public Symbol() {
    }

    public Symbol(Character symbol) {
        this.value = symbol;
    }

    public Character getValue() {
        return value;
    }

    @Override
    public String toSourceString() {
        return getValue().toString();
    }

    @Override
    public void setPart(String string) {
        this.value = string.charAt(0);
    }
}
