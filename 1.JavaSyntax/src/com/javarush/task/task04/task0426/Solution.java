package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x == 0) {
            System.out.print("ноль");
        } else if (x < 0 && x % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (x < 0 && x % 2 == -1) {
            System.out.println("отрицательное нечетное число");
        } else if (x > 0 && x % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (x > 0 && x % 2 == 1) {
            System.out.println("положительное нечетное число");
        }
    }
}
