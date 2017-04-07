package com.javarush.task.task04.task0427;

/* 
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder numberString = new StringBuilder(reader.readLine());
        int numberInt = Integer.parseInt(numberString.toString());
        if (numberString.chars().allMatch(Character :: isDigit ) && numberString.length() <= 3 && numberInt > 0) {
            if (numberInt % 2 == 1) {
                System.out.print("нечетное ");
            } else {
                System.out.print("четное ");
            }
            if (numberString.length() == 1) {
                System.out.print("однозначное число");
            } else if (numberString.length() == 2) {
                System.out.println("двузначное число");
            } else if (numberString.length() == 3) {
                System.out.println("трехзначное число");
            }
        }
    }
}
