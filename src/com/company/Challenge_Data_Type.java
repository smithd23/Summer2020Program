package com.company;
import java.util.*;
public class Challenge_Data_Type {
    //Daniel Smith
    // 06/16/20
    //pseudocode for it
    //declare variables int i =4; double d = 4.0; String s = "Greenhill";
    //use scanner to read the three lines of input (you put the numbers in when program runs)
    //print i + int variable on new line
    //print sum of d+ your double var on a new line to a one decimal point
    //add the string you already have (s) and add it to the inputed string and print that on a new line
    //print output
    //print usernumber + i
    //print user double + d
    //print user string + s
    // make the doubles only have 1 decimal place using %\n
    //user Math.abs to make all numbers pos
    public static void main(String [] args){
        int i = 4;
        double d = 4.0;
        String s = "Greenhill";

        Scanner Scan =new Scanner(System.in);
        int userNumber;
        double userDouble;
        String userString;

        System.out.println("Please enter an integer:");
        userNumber = Scan.nextInt();

        System.out.println("Please enter a double:");
        userDouble = Scan.nextDouble();

        System.out.println("Please enter a phrase:");
        userString = Scan.nextLine();

        System.out.println(userNumber + i);
        System.out.println("This is the double answer: \n %5.1f",userDouble , d);
        System.out.println(userString+ s);




    }



}
