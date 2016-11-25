package com.company;

public class Main {

    public static void main(String[] args) {
        int day = 7;

        switch(day) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
            default:
                System.out.println("Такого дня в неделе нет");
        }

        int card = 4;

        switch(card) {
            case 1: System.out.println("пики"); break;
            case 2: System.out.println("бубны"); break;
            case 3: System.out.println("трефа"); break;
            case 4: System.out.println("червы"); break;
            default:
                System.out.println("Таких карт нет");
        }

        String s = "";

        for(int i = 0; i < 4; i++)
        {
            s = s + "*";
            System.out.println(s);
        }

        System.out.println("Задание 2 -------");

        for(int j = 0; j < 6; j++)
        {
            for(int i = 0; i < 6; i++)
            {
                if(i == 0 || i == 6)
                        System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
