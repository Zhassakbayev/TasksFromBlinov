package com.epam.taskB;

import java.util.*;

public class Word {
    private static String[] changedText;
    private static List<String> word = new ArrayList<>();

    public static List<String> getWord(String text) {
        changedText = text.trim().split("( +)|(\\.+ )|(!+ )|(\\?+ )");
        for (String tempWord : changedText) {
            word.add(tempWord);
        }
        return word;
    }

    public static void sortBySymbolInWord(String text, char symbol) {
        Collections.sort(getWord(text), new WordComparator(symbol));
    }

    private static int count(String word, char symbol) {
        int numberSymbol = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == symbol) {
                numberSymbol++;
            }
        }
        return numberSymbol;
    }
}
