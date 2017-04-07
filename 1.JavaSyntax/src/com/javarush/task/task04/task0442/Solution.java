package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isNegative = false;
        int number;
        int sum = 0;
        while (!isNegative) {
            number = Integer.parseInt(reader.readLine());
            if (number == -1) { isNegative = true;
            sum += number;
            }
            if (isNegative) {
                System.out.println(sum);
            } else {
                sum += number;
            }
        }
    }
}
