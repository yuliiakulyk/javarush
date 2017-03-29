package com.javarush.task.task08.task0827;

import java.util.ArrayList;
import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        long millisInDay = 1000 * 60 * 60 * 24;
        long dayInYear = date1.getTime() / millisInDay;
        System.out.println(dayInYear);
        boolean isOdd = (dayInYear % 2 == 1);
        return isOdd;
    }
}
