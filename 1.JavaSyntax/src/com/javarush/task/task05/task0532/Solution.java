package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
