package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class SentencePart extends AbstractComposite<Lexeme> {
    private List<Lexeme> lexemes = new ArrayList<>();

    public List<Lexeme> getComponents() {
        return lexemes;
    }

    @Override
    public void add(Lexeme lexeme) {
        lexemes.add(lexeme);
    }

    @Override
    public Lexeme get(int index) {
        return lexemes.get(index);
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public String toSourceString() {
        StringBuilder sb = new StringBuilder();
        for (Lexeme lexeme : getComponents()) {
            sb.append(lexeme.toSourceString());
        }
        return sb.toString();
    }
}
