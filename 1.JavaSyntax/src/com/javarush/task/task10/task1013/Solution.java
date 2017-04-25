package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        public Human(String name) {
            this.name = name;
        }

        // напишите тут ваши переменные и конструкторы
        private String name;

        public Human(String name, byte age) {
            this.name = name;
            this.age = age;
        }

        private byte age;

        public Human(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        private int birthYear;

        public Human(String name, String city) {
            this.name = name;
            this.city = city;
        }

        private String city;

        public Human(String name, String city, String country) {
            this.name = name;
            this.city = city;
            this.country = country;
        }

        private String country;

        public Human(String name, boolean maritalStatus) {
            this.name = name;
            this.maritalStatus = maritalStatus;
        }

        private boolean maritalStatus;

        public Human(String name, byte age, int birthYear, String city, String country, boolean maritalStatus) {
            this.name = name;
            this.age = age;
            this.birthYear = birthYear;
            this.city = city;
            this.country = country;
            this.maritalStatus = maritalStatus;
        }

        public Human(String name, byte age, int birthYear, String city, String country) {
            this.name = name;
            this.age = age;
            this.birthYear = birthYear;
            this.city = city;
            this.country = country;
        }

        public Human(String name, String country, boolean maritalStatus) {

            this.name = name;
            this.country = country;
            this.maritalStatus = maritalStatus;
        }

        public Human(String name, byte age, int birthYear, String city) {

            this.name = name;
            this.age = age;
            this.birthYear = birthYear;
            this.city = city;
        }
    }
}
