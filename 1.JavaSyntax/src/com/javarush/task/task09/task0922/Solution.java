package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = simpleDateFormat1.parse(reader.readLine());
        System.out.println(simpleDateFormat2.format(date).toUpperCase());
    }
}
