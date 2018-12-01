package com.epam.taskB;

/*9. Все слова текста рассортировать по возрастанию количества заданной буквы
        в слове. Слова с одинаковым количеством
        расположить в алфавитном порядке.
 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "The article is devoted to the development of information-measuring " +
                "equipment for laboratory sailing wind power plants, as well as economic and" +
                " environmental costs and environmental hazards. This article a new wind turbine " +
                "system based on manipulators instead of traditional wind turbines is explored.";
        Word.sortBySymbolInWord(str,'f');


    }
}
