package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        int letterCounter;
        for (int i = 0; i < alphabet.size(); i++) {
            letterCounter = 0;
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.get(j).length(); k++) {
                    if (list.get(j).charAt(k) == alphabet.get(i)) {
                        letterCounter++;
                    }
                }
            }
            numbers.add(letterCounter);
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + numbers.get(i));
        }
        // напишите тут ваш код
    }

}
