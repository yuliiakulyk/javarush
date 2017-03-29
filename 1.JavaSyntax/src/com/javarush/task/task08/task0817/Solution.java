package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Сергеев", "Сергей");
        map.put("Михайлов", "Михаил");
        map.put("Посунько", "Елена");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Кац", "Майкл");
        map.put("Григорьев", "Григорий");
        map.put("Степанищенко", "Степан");
        map.put("Крутько", "Максим");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        Iterator iterator = copy.entrySet().iterator();
        LinkedList<String> list = new LinkedList<>();
        String a;
        Map.Entry<String, String> entry;
        while (iterator.hasNext()) {
            entry = (Map.Entry)iterator.next();
            a = entry.getValue();
            if (list.contains(a))
                removeItemFromMapByValue(map, a);
            else
                list.add(a);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        for (Map.Entry entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
