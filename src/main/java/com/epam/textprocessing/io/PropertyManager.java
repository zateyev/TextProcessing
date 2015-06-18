package com.epam.textprocessing.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private final Properties properties;

    public PropertyManager(String fileName) {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(fileName);
        properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
