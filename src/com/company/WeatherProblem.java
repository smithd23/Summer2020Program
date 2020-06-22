package com.company;
import java.util.Random;
import java.util.Arrays;
public class WeatherProblem {
    public static int numbers;
    public static void main(String[] args) {
        int[] intArray = new int[7];
        Random rando = new Random();
        int done = 0;
        for (int index = 0; index < intArray.length; index++) {
             numbers = intArray[index] = rando.nextInt(85) + 25;
            System.out.println(numbers);
            done = done + intArray[index];

        }

        double avg = done / intArray.length;
        System.out.println("The avg is:" + avg);
        int count = 0;

        for (int i = 0; i < 7; i++) {
            if (intArray[i] > avg) {
                count++;
            }
        }
        System.out.println("There are " + count + " days above the average.");
    }
    }













