package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends AbstractComposite<SentencePart> {
    private List<SentencePart> sentenceParts = new ArrayList<>();

    public Sentence() {
    }

    public Sentence(List<SentencePart> lexemes) {
        this.sentenceParts = lexemes;
    }

    public List<SentencePart> getComponents() {
        return sentenceParts;
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
        sentenceParts.add(sentencePart);
    }

    @Override
    public SentencePart get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {
    }
}