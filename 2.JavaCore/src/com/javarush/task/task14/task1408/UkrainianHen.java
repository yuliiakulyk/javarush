package com.javarush.task.task14.task1408;

/**
 * Created by Yuliia Kulyk on 25.06.2017.
 */
class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
