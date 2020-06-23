package com.company;
import java.util.*;
import java.util.Random;
//Daniel
//06/23/2020
//bring in scanner
//bing in random class
//create main method
//in main create new random
//create new int"Size" which will be the amount of numbers used, from 5 to 10
//create new int that begins the array
//create for loop that determines random numbers based on the random of the amount of numbers
//call swap
//print answer
//create new method using int[], which utilizes the array
//crwate ints i and j in this method
//create for loop for the swapping
//swap the numbers
//return the method

public class CLassWork {
    public static void main(String[] args) {
        Random randy = new Random();//random
        int Size = randy.nextInt(5) + 5;//size variable defined
        System.out.println("You will receive " + Size+ " random numbers");
        int[] a1 = new int[Size];//initializes array
        for (int i = 0; i < Size; i++) {//for loop for the numbers
            a1[i] = randy.nextInt(100);//random bound, creates random numbers less than 100
        }
        int b;
        int c;//declaring new vars
        do{
            b=randy.nextInt(Size);
            c=randy.nextInt(Size);
        }while (b==c);//making sure the indexes are dif
        System.out.println(Arrays.toString(a1));//prints string results1
        //make these two numbers random but not equal
        int[] swapvar = swap(a1, b, c);//calls swap method and ints

        System.out.println(Arrays.toString(swapvar));//prints string results2
    }



        public static int[] swap(int[] a1, int i, int j) {//declaes var i var j

            //for loop not needed
            int temp = a1[i];//new int for a1[i]
            a1[i] = a1[j];//makes a1i=a1j
            a1[j] = temp;

            return a1;//returns to main

        }
   }




