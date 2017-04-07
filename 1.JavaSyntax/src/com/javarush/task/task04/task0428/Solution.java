package com.javarush.task.task04.task0428;

/* 
Положительное число
Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных чисел в исходном наборе.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int positive = 0;
        if (a > 0)
            positive++;
        if (b > 0)
            positive++;
        if (c > 0)
            positive++;
        System.out.println(positive);
    }
}
