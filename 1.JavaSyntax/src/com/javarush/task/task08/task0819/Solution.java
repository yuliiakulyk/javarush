package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        while (true) {
            iterator.next();
            if (iterator.hasNext() == false) {
                iterator.remove();
                break;
            }
        }
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set set = new HashSet<Cat>();
        set.add(new Cat("cat1"));
        set.add(new Cat("cat2"));
        set.add(new Cat("cat3"));
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iterator = cats.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }
    }

    // step 1 - пункт 1
}
