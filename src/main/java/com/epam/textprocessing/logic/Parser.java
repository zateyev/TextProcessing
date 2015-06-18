package com.epam.textprocessing.logic;

import com.epam.textprocessing.entity.Paragraph;
import com.epam.textprocessing.entity.Sentence;
import com.epam.textprocessing.entity.Symbol;
import com.epam.textprocessing.entity.Word;

public class Parser {
    public Sentence parseSentence(String textString) {
        Sentence sentence = new Sentence();
        String[] split = textString.split("(?<=[\\w])(?=[ .!?])|(?<=[ .!?])(?=\\w)");
        for (String part : split) {
            if (part.length()==1) sentence.add(new Symbol(part.charAt(0)));
            else sentence.add(new Word(part));
        }
        return sentence;
    }

    public Paragraph parseParagraph(String textString) {
        Paragraph paragraph = new Paragraph();
        String[] split = textString.split("\\n+");
        for (String part : split) {
            paragraph.add(parseSentence(part));
        }
        return paragraph;
    }
}
