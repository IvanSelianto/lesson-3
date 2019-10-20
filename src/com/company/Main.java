package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(" " + array[i] + " ");

        }
        System.out.println();
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(+array[i]);
            }

        }*/
        /*for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i + 1]);
            }

        }*/
        //  System.out.println(array[array.length - 1]);
        int k = 0;
        int min = array[0];
        while (k < array.length) {
            if (min > array[k]) {
                min = array[k];

            }
            k++;

        }
        System.out.println(min);
        for (int j = 1; j < array.length; j += 2) {
            System.out.println(Math.pow(array[j], 2));
        }
        for (int j = 0; j < array.length - 1; j++) {
            System.out.println(Math.sqrt(array[j] * array[j + 1]));
        }
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int max = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = max;

                }
            }


            // write your code here
        }

        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (max < array[i]) {
                max = array[i];


            }

        }
        System.out.println(max);

        int[] arrTmp = new  int [array.length];
        int minTmp =array[0];
        int indexTmp = 0;
        boolean [] isUsed = new boolean[array.length];
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array.length;j++){
                if(array[j]<minTmp){
                    minTmp = array[j];

                }
            }
        }



    }




}

