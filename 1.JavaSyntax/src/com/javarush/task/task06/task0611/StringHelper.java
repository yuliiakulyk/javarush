package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper {
    public static String multiply(String s) {
        //напишите тут ваш код
        return multiply(s, 5);
    }

    public static String multiply(String s, int count) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < count; i++) {
            builder.append(s);
        }
        //напишите тут ваш код
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("sdfkjsdfj", 3));
        System.out.println(StringHelper.multiply("sdssssssssss"));
    }
}
