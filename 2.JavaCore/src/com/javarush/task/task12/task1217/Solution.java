package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly {
        void moveUp();
    }

    public interface Run {
        void runDistance(int kilometers);
    }

    public interface Swim {
        void getTo(String shore);
    }
}
