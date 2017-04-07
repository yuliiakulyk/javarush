package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты — желтый,
а потом в течение одной минуты — красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        double time = Double.parseDouble(input);
        if (time % 5 < 3) {
            System.out.println("зелёный");
        } else if (time % 5 >=3 && time % 5 <= 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}