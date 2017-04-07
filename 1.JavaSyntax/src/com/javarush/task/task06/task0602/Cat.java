package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() {
        System.out.println("Cat was destroyed");
    }
    //напишите тут ваш код

}

class Dog {
    //напишите тут ваш код
    protected void finalize() {
        System.out.println("Dog was destroyed");
    }
}
