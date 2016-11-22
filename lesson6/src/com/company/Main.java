package com.company;

public class Main {

    public static void main(String[] args) {
        Main method = new Main();

        method.isEven(10);
        method.isBD(9);
        method.isWin(1);
        method.isWin(0);
        method.isWin(3);
        method.whoBig(77);
        method.isBig(1,3);
        method.whoDel(123321);
    }

    void isBD (int day)
    {
        if(day == 9)
            System.out.println("День программиста");
        else
            System.out.println("Другое");
    }

    void isEven(int x)
    {
        if(x%2 == 0)
            System.out.println("Четное!");
        else
            System.out.println("Другое");
    }

    void isWin(int score)
    {
        if(score == 1)
            System.out.println("ничья");
        else if(score == 0)
            System.out.println("проигрыш");
        else if (score == 3)
            System.out.println("выигрыш");
    }

    void whoBig(int num)
    {
        int one = num / 10;
        int two = num%10;

        if(one > two)
            System.out.println("Больше первая");
        else if (two > one)
            System.out.println("Больше вторая");

        if(one == two)
            System.out.println("Они одинаковы");
    }

    void isBig(int a, int b) {
        if (a > b)
            System.out.println("а больше b");
        else
            System.out.println("b больше a");
    }

    void whoDel(int a)
    {
        int luckOne1 = a / 100000;
        int luckOne2 = (a / 10000) % 10;
        int luckOne3 = (a / 1000) % 10;
        int luckOne4 = (a / 100) % 10;
        int luckOne5 = (a / 10) % 10;
        int luckOne6 = (a / 1) % 10;

        System.out.println(luckOne1);
        System.out.println(luckOne2);
        System.out.println(luckOne3);
        System.out.println(luckOne4);
        System.out.println(luckOne5);
        System.out.println(luckOne6);
    }
}
