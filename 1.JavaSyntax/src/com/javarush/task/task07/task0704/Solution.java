package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        int[] ints1 = new int[10];
        for (int i = 0; i < 10; i++) {
            ints1[i] = ints[10 - i - 1];
            System.out.println(ints1[i]);
        }
    }
}

