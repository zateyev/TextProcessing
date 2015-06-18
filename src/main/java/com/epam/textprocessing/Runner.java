package com.epam.textprocessing;

import com.epam.textprocessing.entity.Sentence;
import com.epam.textprocessing.logic.Parser;

public class Runner {
    public static void main(String[] args) {
        String textString = "This is a sample text. Hello world!\nThis is a second sample text. Hello world!";
        Parser parser = new Parser();
        Sentence sentence = parser.parseSentence(textString);
        System.out.println(sentence.toSourceString());
    }
}
