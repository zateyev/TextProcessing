package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class SentencePart extends AbstractComposite<Lexeme> {
    public List<Lexeme> getComponents() {
        return super.getComponents();
    }

    @Override
    public void add(Lexeme lexeme) {
        super.add(lexeme);
    }

    @Override
    public Lexeme get(int index) {
        return super.get(index);
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void clear() {
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
