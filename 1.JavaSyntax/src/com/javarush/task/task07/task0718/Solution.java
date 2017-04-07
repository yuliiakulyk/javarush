package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            lengths.add(list.get(i).length());
        }
        Collections.sort(lengths);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() != lengths.get(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}

