package com.javarush.task.task04.task0430;

/* 
От 1 до 10
Вывести на экран числа от 1 до 10 используя цикл while. Каждое значение с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}