package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello world", PoemBeautifier::addABCAfter);
        poemBeautifier.beautify("Hello world", PoemBeautifier::addABCBefore);
        poemBeautifier.beautify("hello world", PoemBeautifier::upperText);
        poemBeautifier.beautify("HELLO WORLD", PoemBeautifier::lowerText);
        poemBeautifier.beautify("Hello world", PoemBeautifier::suffixExclam);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}