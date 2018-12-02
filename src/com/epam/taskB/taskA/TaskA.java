package com.epam.taskB.taskA;

import com.sun.javafx.geom.transform.SingularMatrixException;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        InputStreamReader  inputStreamReader = new InputStreamReader(System.in);
        String text = null;
        try(BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            text = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] chars = text.toCharArray();
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        int totalSumNumbers = 0;
        for (int i=0;i<chars.length;i++) {
            for (int m=0; m<number.length;m++){
                if (number[m]==Character.digit(chars[i],10)){
                    totalSumNumbers+=number[m];
                }
            }
        }
        System.out.println(totalSumNumbers);
        File file = new File("text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write(text+"\n"+totalSumNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
