package com.javarush.task.task14.task1408;

/**
 * Created by Yuliia Kulyk on 25.06.2017.
 */
class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
