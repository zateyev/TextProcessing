package com.epam.textprocessing.logic;

import com.epam.textprocessing.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Action {
    public static Text sortByWordCount(Text text) {
        return null;
    }

    public List<String> sortWords(Sentence sentence) {
        List<String> words = new ArrayList<>();
        for (SentencePart part : sentence.getComponents()){
            String regexPart = ("\\w+");
            Pattern pPart = Pattern.compile(regexPart);
            Matcher mPart = pPart.matcher(part.toSourceString());
            while (mPart.find()) {
                words.add(mPart.group());
            }
            Collections.sort(words);
        }
        return words;
    }
}
