package com.epam.taskB;

import java.util.Comparator;

public class WordComparator implements Comparator<String> {
    private char symbol;

    WordComparator(char symbol) {
        this.symbol = symbol;
    }

    int matchesCount(String s) {
        int found = 0;

        for ( char c : s.toCharArray() )
            if ( symbol == c )
                ++found;

        return found;
    }
    @Override
    public int compare(String a, String b) {
        int diff = matchesCount(a) - matchesCount(b);
        return ( diff != 0 ) ? diff : a.compareToIgnoreCase(b);
    }
}
