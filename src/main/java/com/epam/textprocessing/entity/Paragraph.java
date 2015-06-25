package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractComposite<Sentence> {
    public Paragraph() {
    }

    public Paragraph(List<Sentence> sentences) {
        super(sentences);
    }

    public List<Sentence> getComponents() {
        return super.getComponents();
    }

    public int getSentenceAmount() {
        return super.getComponents().size();
    }

    @Override
    public String toSourceString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : getComponents()) {
            sb.append(s.toSourceString());
        }
        return sb.toString();
    }

    @Override
    public void add(Sentence sentence) {
        super.add(sentence);
    }

    @Override
    public Sentence get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void clear() {
    }
}
