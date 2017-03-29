package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 02 2014«.
*/

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(calendar.DAY_OF_MONTH) + " 0" + (calendar.get(calendar.MONTH)+1) + " " + calendar.get(calendar.YEAR));
    }
}
