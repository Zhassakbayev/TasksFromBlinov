package com.epam.taskB;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private String text;
    private List<Paragraph> paragraphs = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Paragraph> parseToParagraphs() {
        String[] text = getText().split("(\\s{2,})");
        for (String currentParagraph : text) {
            Paragraph paragraph = new Paragraph(currentParagraph);
            paragraphs.add(paragraph);
        }
        return paragraphs;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}
