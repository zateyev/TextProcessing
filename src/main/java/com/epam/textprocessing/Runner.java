package com.epam.textprocessing;

import com.epam.textprocessing.entity.Paragraph;
import com.epam.textprocessing.entity.Sentence;
import com.epam.textprocessing.entity.Text;
import com.epam.textprocessing.io.TextLoad;
import com.epam.textprocessing.logic.Action;
import com.epam.textprocessing.logic.Parser;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String book = TextLoad.readFile("book.txt");
        String textString = "This is a sample text. Hello world!\nThis is a second sample text. Hello world!";
        Parser parser = new Parser();
        try {
            Sentence sentence = parser.parse(book, Sentence.class);
            System.out.println(sentence.toSourceString());
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

//        String[] strarray = book.split("(?<=[.?!] )");
//        for (String s : strarray) {
//            System.out.println(s);
//        }
//        Class<Sentence> sentenceClass = Sentence.class;
//        Sentence txt = new Sentence();
//        System.out.println(sentenceClass.getName());
    }
}
