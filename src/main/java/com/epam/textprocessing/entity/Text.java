package com.epam.textprocessing.entity;

import java.util.ArrayList;
import java.util.List;

public class Text extends AbstractComposite<Paragraph> {
    public Text() {
    }

    public Text(List<Paragraph> paragraphs) {
        super(paragraphs);
    }

    public List<Paragraph> getComponents() {
        return super.getComponents();
    }

    @Override
    public String toSourceString() {
        StringBuilder sb = new StringBuilder();
        for (Paragraph s : getComponents()) {
            sb.append(" ").append(s.toSourceString()).append("\n");
        }
        return sb.toString().replaceAll(" +|\t+", " ");
    }

    @Override
    public void add(Paragraph paragraph) {
        super.add(paragraph);
    }

    @Override
    public Paragraph get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void clear() {
    }
}
