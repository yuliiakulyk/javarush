package com.javarush.task.task04.task0425;

/* 
Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1");
            } else if (x < 0 && y > 0) {
                System.out.println("2");
            } else if (x < 0 && y < 0) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        }
    }
}
