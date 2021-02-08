package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//		Объявили и инициализировали int
        int yearOfBirthday = 1985;
        int monthOfBirthday = 8;
        int dayOfBirthday = 12;
//		Сумма
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);
        boolean monthBiggerDay = (monthOfBirthday > dayOfBirthday);
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
//		Одномерный символьный массив
        char[] list1 = new char[7];
        list1[0] = 'А';
        list1[1] = 'л';
        list1[2] = 'е';
        list1[3] = 'к';
        list1[4] = 'с';
        list1[5] = 'е';
        list1[6] = 'й';
        System.out.print("Массив с моим именем: ");
//		Вывод через for
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i]);
        }
        System.out.println();
//		Объявили и инициализировали double
        double myAge = 35;
        double partYear = 4.0 / 12.0;
        double myAgesum = myAge + partYear;
//	    Формат double myAgesum до 2 числа
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Мне " + df.format(myAgesum) + " лет");
    }
}
