package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter operator : ");

            String operator = scanner.next();

            System.out.print("Enter first operand : ");
            int a = scanner.nextInt();

            System.out.print("Enter second operand : ");
            int b = scanner.nextInt();

            switch (operator) {
                case "+" :
                    System.out.println(a + " " + operator + " " + b + " = " + Calc.sum(a, b));
                    break;
            }
            System.out.println("What you like to continue? Enter y/n ");

            String exitWork = scanner.next();
            

            if(exitWork != null && exitWork.length() > 0 && !exitWork.equalsIgnoreCase("y")) break;;
        }
    }
}
