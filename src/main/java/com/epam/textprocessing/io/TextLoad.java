package com.epam.textprocessing.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextLoad {
    public static String readFile(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStreamReader fr = new InputStreamReader(TextLoad.class.getClassLoader().getResourceAsStream(filePath));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}