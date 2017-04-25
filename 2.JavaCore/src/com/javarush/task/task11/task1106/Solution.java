package com.javarush.task.task11.task1106;

/* 
Скрытный инкапсулированный кот
Скрыть все внутренние переменные класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        public String getName() {
            return name;
        }

        private String name;

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

