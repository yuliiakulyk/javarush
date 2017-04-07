package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man sasha = new Man("Sasha", 19, "Lomonosova");
        Man petya = new Man("Petya", 19, "Lomonosova");
        Woman yulia = new Woman("Yulia", 23, "Strategichne");
        Woman masha = new Woman("Masha", 23, "Strategichne");
//        sasha.print();
//        petya.print();
//        yulia.print();
//        masha.print();
        System.out.println(sasha.name + " " + sasha.age + " " + sasha.address);
        System.out.println(petya.name + " " + petya.age + " " + petya.address);
        System.out.println(yulia.name + " " + yulia.age + " " + yulia.address);
        System.out.println(masha.name + " " + masha.age + " " + masha.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print() {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void print() {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
    //напишите тут ваш код
}
