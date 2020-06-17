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
        Math.abs(userNumber);

        System.out.println("Please enter a double:");
        userDouble = Scan.nextDouble();
        Math.abs(userDouble);

        System.out.println("Please enter a phrase:");
        userString = Scan.nextLine();
        String begin=userString.substring(0);
        begin = Scan.nextLine();



        //here i am trying to fix the problem cause by just using next line
        // i am going to try and use index or else it will cut out the first word


//i am using abs we cant go negative
        System.out.printf("\n %3d " , Math.abs(userNumber) + i);
        System.out.printf("\n %2.1f", d + Math.abs(userDouble));
        System.out.println("");
        System.out.print(" " + s+" " +begin);




    }



}
