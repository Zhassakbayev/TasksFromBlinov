package com.epam.taskB;

import java.util.Comparator;

public class WordComparator implements Comparator<Word> {
    private char symbol;

    WordComparator(char symbol) {
        this.symbol = symbol;
    }

    int count(Word word) {
        int found = 0;

        for ( char c : word.getText().toLowerCase().toCharArray())
            if ( symbol == c )
                ++found;

        return found;
    }
    @Override
    public int compare(Word a, Word b) {
        int diff = count(a) - count(b);
        return ( diff != 0 ) ? diff : a.getText().compareToIgnoreCase(b.getText());
    }
}
