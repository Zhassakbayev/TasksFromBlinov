package com.epam.taskB;

import java.util.*;

public class Word {
    private String text;
    private List<Word> words = new ArrayList<>();

    public Word(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Word> parseToWords(){
        String[] text= getText().split("\\s+");
        for (String currentWord : text){
            Word word  =new Word(currentWord);
            words.add(word);
        }
        return words;
    }

    public void sortBySymbolInWord(char symbol) {
      Collections.sort(parseToWords(), new WordComparator(symbol));
    }

    @Override
    public String toString() {
        return  text + ",";
    }
}
