package com.epam.taskB;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private static String[] changedText;

    public static String[] getSentence(String text) {
        changedText = text.trim().split("(\\.+ )|(!+ )|(\\?+ )");
        return changedText;
    }
}
