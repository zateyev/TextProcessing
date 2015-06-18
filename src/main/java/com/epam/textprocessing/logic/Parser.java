package com.epam.textprocessing.logic;

import com.epam.textprocessing.entity.*;
import com.epam.textprocessing.io.PropertyManager;

public class Parser {
    private final PropertyManager propertyManager = new PropertyManager("parser.properties");

    public Sentence parseSentence(String textString) {
        Sentence sentence = new Sentence();
        String[] split = textString.split(propertyManager.getProperty("sentence_part_splitter"));
        for (String part : split) {
            if (part.length() == 1) sentence.add(new Symbol(part.charAt(0)));
            else sentence.add(new Word(part));
        }
        return sentence;
    }

    public Paragraph parseParagraph(String textString) {
        Paragraph paragraph = new Paragraph();
        String[] split = textString.split(propertyManager.getProperty("paragraph_splitter"));
        for (String part : split) {
            paragraph.add(parseSentence(part));
        }
        return paragraph;
    }

    public Text parseText(String textString) {
        Text text = new Text();
        text.add(parseParagraph(textString));
        return null;
    }
}
