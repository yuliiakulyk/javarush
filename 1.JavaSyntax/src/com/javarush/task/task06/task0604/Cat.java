package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик\
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1.
В методе finalize уменьшать на 1.
*/

public class Cat {
    public static int catCount = 0;

    //напишите тут ваш код
    public Cat() {
        catCount++;
    }

    protected void finalize() {
        catCount--;
    }

    public static void main(String[] args) {

    }
}