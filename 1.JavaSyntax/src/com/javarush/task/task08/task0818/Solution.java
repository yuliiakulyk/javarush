package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Петров", 1000);
        map.put("Сидоров", 200);
        map.put("Ибрагимов", 300);
        map.put("Соловьев", 1500);
        map.put("Скворцов", 600);
        map.put("Михайлец", 700);
        map.put("Калугин", 800);
        map.put("Соловьева", 100);
        map.put("Губин", 150);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        //map.entrySet().removeIf(entry -> entry.getValue() < 500);
        Iterator iterator = map.entrySet().iterator();
        Map.Entry<String, Integer> entry1;
        while(iterator.hasNext()) {
            entry1 = (Map.Entry) iterator.next();
            if (entry1.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//        removeItemFromMap(map);
//        for (Map.Entry entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}