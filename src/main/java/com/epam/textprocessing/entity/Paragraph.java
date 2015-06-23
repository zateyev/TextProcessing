package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractComposite<Sentence> {
    private List<Sentence> sentences = new ArrayList<Sentence>();

    public Paragraph() {
    }

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getComponents() {
        return sentences;
    }

    public int getSentenceAmount() {
        return sentences.size();
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
        sentences.add(sentence);
    }

    @Override
    public Sentence get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {
    }
}
