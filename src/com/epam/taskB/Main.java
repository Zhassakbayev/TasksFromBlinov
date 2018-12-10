package com.epam.taskB;

/*9. Все слова текста рассортировать по возрастанию количества заданной буквы
        в слове. Слова с одинаковым количеством
        расположить в алфавитном порядке.
 */


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (!file.exists()) {
            System.out.println("File is not found!");
        }
        String text = null;
        text = new String(Files.readAllBytes(Paths.get("text.txt")), StandardCharsets.UTF_8);

//        Paragraph paragraph = new Paragraph(text);
//        for (Paragraph paragraph1 : paragraph.parseToParagraphs()) {
//            System.out.println(paragraph1);
//        }
//
//        Sentence sentence = new Sentence(text);
//        for (Sentence sentence1 : sentence.parseTextToSentences()) {
//            System.out.println(sentence1);
//        }

        Word word = new Word(text);
        word.sortBySymbolInWord('a');
        for (Word word1 : word.getWords()) {
            System.out.println(word1);
        }
    }
}
