package com.javarush.task.task14.task1408;


/**
 * Created by Yuliia Kulyk on 25.06.2017.
 */
class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
