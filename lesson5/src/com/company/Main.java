package com.company;

public class Main {

    public static void main(String[] args) {
	    for(int i = 10; i > 0; i--)
        {
            int sqrt = i * i;
            int sqrt1 = sqrt * i;

            System.out.println("Квадраты " + sqrt);
            System.out.println("Кубы " + sqrt1);
        }

        int [] arr = {1,2,3};
        int a = 1;
        mod(arr);
    }

    static void mod(int[] arr){
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] *= 2;
            //arr[i] = i * 2;
            //arr[i] = arr[i] - a;
            //arr[i] = arr[i] / arr[0];

            System.out.println(arr[i]);
        }
       // return arr;
    }

}
