package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
«Имя» получает «число1» через «число2» лет.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        System.out.println(name + " получает " + sNum1 + " через " + sNum2 + " лет.");
    }
}
