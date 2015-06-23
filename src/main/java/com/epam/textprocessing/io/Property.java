package com.epam.textprocessing.io;

import com.epam.textprocessing.entity.*;

import java.util.HashMap;
import java.util.Map;

public class Property {
    private final String className;

    public Property(String className) {
        this.className = className;
    }

    public String getRegexKey() {
        Map<String, String> regexes = new HashMap<>();
        regexes.put(Text.class.getName(), "paragraph_splitter");
        regexes.put(Paragraph.class.getName(), "sentence_splitter");
        regexes.put(Sentence.class.getName(), "sentence_part_splitter");
        return regexes.get(this.className);
    }

    public Class<? extends Composite> getClassPart() {
        Map<String, Class<? extends Composite>> content = new HashMap<>();
        content.put(Text.class.getName(), Paragraph.class);
        content.put(Paragraph.class.getName(), Sentence.class);
        content.put(Sentence.class.getName(), SentencePart.class);
        return content.get(this.className);
    }
}