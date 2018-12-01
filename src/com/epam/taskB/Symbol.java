package com.epam.taskB;

import java.util.ArrayList;
import java.util.List;

public class Symbol {
    private static char[] changedText;
    private static List<Character> symbols = new ArrayList<>();

    public static List<Character> getSymbol(String text) {
            changedText = text.trim().toCharArray();
            for (char tempSymbol : changedText) {
                if (tempSymbol!=' ')
                symbols.add(tempSymbol);
            }
        return symbols;
    }
}
