package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends AbstractComposite<SentencePart> {
    public Sentence() {
    }

    public Sentence(List<SentencePart> lexemes) {
        super(lexemes);
    }

    public List<SentencePart> getComponents() {
        return super.getComponents();
    }

    @Override
    public String toSourceString() {
        StringBuilder sb = new StringBuilder();
        for (SentencePart p : getComponents()) {
            sb.append(p.toSourceString());
        }
        return sb.toString();
    }

    @Override
    public void add(SentencePart sentencePart) {
        super.add(sentencePart);
    }

    @Override
    public SentencePart get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void clear() {
    }
}