package com.javarush.task.task04.task0431;

/* 
От 10 до 1
Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

    }
}
