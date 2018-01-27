package com.kodilla.stream.beautifier;

public class DifferentBeautifiers {
    public static String abcAdd (String text) {
        return "ABC" + text + "ABC";
    }
    public static String capitalics (String text) {
        String caps = text.toUpperCase();
        return caps;
    }
    public static String lowEToUpCaseA (String text) {
        String eLowToUp = text.replace("e", "E");
        return eLowToUp;
    }
    public static String splitedText (String text) {
        String splitSentence = text.replace("e", "\n");
        return splitSentence;

    }
}
