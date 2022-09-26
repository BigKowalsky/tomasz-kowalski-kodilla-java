package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("Text beautification: " + result);
    }

    public static String addABCAfter(String text) {
        return text + " ABC";
    }

    public static String addABCBefore(String text) {
        return "ABC " + text;
    }

    public static String upperText(String text) {
        return text.toUpperCase();
    }

    public static String lowerText(String text) {
        return text.toLowerCase();
    }

    public static String suffixExclam(String text) {
        return text + "!!!";
    }
}
