package com.epam.taskB;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Sentence {
    private String text;
    private List<Sentence> sentences = new ArrayList<>();

    public Sentence(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public List<Sentence> parseTextToSentences(){
        String[] text= getText().split("([.!?])+(\\s)*");
        for (String currentSentence : text){
            Sentence sentence = new Sentence(currentSentence);
            sentences.add(sentence);
        }
        return sentences;
    }


    @Override
    public String toString() {
        return "Sentence{" +
                "text='" + text + '\'' +
                '}';
    }
}
