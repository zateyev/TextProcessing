package com.epam.textprocessing.logic;

import com.epam.textprocessing.entity.*;
import com.epam.textprocessing.io.Property;
import com.epam.textprocessing.io.PropertyManager;

public class Parser {
    public <T extends Composite> T parse(String textString, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        if (clazz.getName().equals(SentencePart.class.getName())) {
            SentencePart sentencePart = new SentencePart();
            if (textString.length() == 1) {
                Symbol symbol = new Symbol(textString.charAt(0));
                sentencePart.add(symbol);
            } else {
                Word word = new Word(textString);
                sentencePart.add(word);
            }
            return (T) sentencePart;
        }
        T composite = clazz.newInstance();
        PropertyManager property = new PropertyManager("regexes.properties");
        Property currentClassProperty = new Property(clazz.getName());
        String regex = property.getProperty(currentClassProperty.getRegexKey());
        String[] split = textString.split(regex);
        for (String s : split) {
            composite.add(parse(s, currentClassProperty.getClassPart()));
        }
        return composite;
    }
}
