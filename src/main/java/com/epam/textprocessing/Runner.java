package com.epam.textprocessing;

public class Runner {
    public static void main(String[] args) {
//        String filePath = "D:\\text.txt";
//        Text text = new Text(TextLoad.readFile(filePath));
//        Text sortingByWordCount = Action.sortByWordCount(text);
        String textString = "This is a  sample text. Hello world!";
        String[] split = textString.split("(?<=[\\w])(?=[ .!?])|(?<=[ .!?])(?=\\w)");
        for (String part : split) {
            System.out.println(part);
        }
    }
}
