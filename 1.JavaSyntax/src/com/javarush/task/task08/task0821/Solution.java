package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
4. В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
5. В методе createPeopleList() должны добавляться люди с одинаковыми именами.
6. Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7. Метод main() должен вызывать метод createPeopleList().
8. Метод main() должен вызывать метод printPeopleList().

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name4");
        map.put("Surname5", "Name5");
        map.put("Surname6", "Name6");
        map.put("Surname7", "Name1");
        map.put("Surname8", "Name1");
        map.put("Surname9", "Name1");
        map.put("Surname1", "Name9");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
