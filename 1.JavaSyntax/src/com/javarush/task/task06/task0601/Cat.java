package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable.
*/

public class Cat {
    //напишите тут ваш код
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("Cat is destroyed");
    }
}
