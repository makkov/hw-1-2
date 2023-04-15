package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

//        //Переменные - Задача 2
//        double weightFirst = 78.2;
//        double weightSecond = 82.7;
//        double totalWeight = weightFirst + weightSecond;
//        double diffWeight = Math.abs(weightFirst - weightSecond);
//        System.out.println("Общий вес: " + totalWeight + " кг");
//        System.out.println("Разница в весе: " + diffWeight + " кг");
//
//        //Переменные - Задача 3
//        int bananaCount = 5;
//        int bananaWeight = 80;
//        int milkCount = 2;
//        int milkWeight = 105;
//        int iceCreamCount = 2;
//        int iceCreamWeight = 100;
//        int eggCount = 4;
//        int eggWeight = 70;
//
//        int totalWeightGr =
//                bananaCount * bananaWeight
//                + milkCount * milkWeight
//                + iceCreamCount * iceCreamWeight
//                + eggCount * eggWeight;
//        System.out.println("Общий вес: " + totalWeightGr + " г");
//
//        double totalWeightKg = (double) totalWeightGr / 1000;
//        System.out.println("Общий вес: " + totalWeightKg + " кг");
//
        //Переменные - Задача 4
//        int weightDifGoalKg = 7;//кг
//
//        int minDif = 250;//г
//        int maxDif = 500;//г
//        double averageDif = (double) (minDif + maxDif) / 2;
//
//        int maxDays;
//        int minDays;
//        double averageDays;
//
//        int weightDifGoalG = weightDifGoalKg * 1000;
//
//        maxDays = weightDifGoalG / minDif;
//        minDays = weightDifGoalG / maxDif;
//        averageDays = weightDifGoalG / averageDif;
//
//
//        System.out.println(maxDays + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
//        System.out.println(averageDays + " дней уйдёт на похудение, если спортсмен будет терять каждый день по " + averageDif +" грамм");
//        System.out.println(minDays + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
//
//        //Переменные - Задача 5
        int idx = 10;
        double mashaSalary = 10000;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        //проведем индексацию зп
        double coef = 1.0 + (double) idx / 100;
        double mashaSalaryAfterIdx = mashaSalary * coef;
        double denisSalaryAfterIdx = denisSalary * coef;
        double kristinaSalaryAfterIdx = kristinaSalary * coef;

        System.out.println("Запрплаты после индексации: ");
        System.out.println(mashaSalaryAfterIdx);
        System.out.println(denisSalaryAfterIdx);
        System.out.println(kristinaSalaryAfterIdx);

        //рассчитаем разницу в годовом доходе
        double mashaYearDiff = (mashaSalaryAfterIdx - mashaSalary) * 12;
        double denisYearDiff = (denisSalaryAfterIdx - denisSalary) * 12;
        double kristinaYearDiff = (kristinaSalaryAfterIdx - kristinaSalary) * 12;
        System.out.println("Разница в годовом доходе:");
        System.out.println(mashaYearDiff);
        System.out.println(denisYearDiff);
        System.out.println(kristinaYearDiff);
    }
}
