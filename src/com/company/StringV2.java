package com.company;
import java.util.*;
//Daniel
//06/22/2020
//this version is to make it so that we can input all words at once and it will work
//copy the code from String challenge for the basis
//modify code so that i aks for all words at beginning and print them all together after the division

import java.util.*;
public class StringV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//brings in scanner
        int T;//defines var T
        do{//do while
            System.out.print("Please input the amount of words you are going to use. (Has to be between 2 and 10): ");
            T = input.nextInt();//this is the amount of words
        }while (T < 2 || T > 10);//limits the amount
        String[] Stringy= new String[T];//new array
        System.out.println("Please enter your phrase: ");
        for (int i = 0; i < Stringy.length; i++) {//the for loop that runs this repeatedly for the amount of words
            Stringy[i] = input.next();
        }
        do {//do while
        System.out.println();
        String[]Stringy2=new String[Stringy.length];//array
        for(int i =0; i<Stringy.length; i++) {//controls array
           Stringy2[i]=divide(Stringy[i]);
           System.out.println(Stringy2[i]);
        }
            } while (Stringy.length < 2 || Stringy.length > 10000);//this limits the values to inbetween these 2 numbers

        }
//same as before
    //here i should print the method divided
    public static String divide(String Stringy) {//this allows string to come into this method
        String even= " ";//initializes without really defining so less pressure
        String odd= " ";
        char Evenletter;//defining them here bc you cant in a for loop
        char Oddletter;
        for(int even2=0; even2<Stringy.length();even2+=2){//for loop equation
            Evenletter=Stringy.charAt(even2);//
            even=even+Evenletter;//this makes it so that the even variable will keep refreshing itself and growing for every different even letter
        }
        for(int odd2=1; odd2<Stringy.length();odd2+=2) {//starts at 1 so it will be odd
            Oddletter = Stringy.charAt(odd2);
            odd = odd + Oddletter;//same as even function but for odds
        }
        String done;
        done = (even+" "+ odd);//this compiles the even numbers and the odds
        return done;//this returns it
    }
}


    //here i should print the method divided
