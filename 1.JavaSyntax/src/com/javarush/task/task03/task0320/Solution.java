package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(reader.readLine() + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
