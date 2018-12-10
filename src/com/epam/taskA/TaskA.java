package com.epam.taskA;

import java.io.*;

public class TaskA {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        String text = null;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        text = bufferedReader.readLine();
        char[] chars = text.toCharArray();
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int totalSumNumbers = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int m = 0; m < number.length; m++) {
                if (number[m] == Character.digit(chars[i], 10)) {
                    totalSumNumbers += number[m];
                }
            }
        }
        System.out.println(totalSumNumbers);
        File file = new File("Result.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text + "\n" + totalSumNumbers);
    }
}
