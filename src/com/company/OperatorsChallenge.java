package com.company;
import java.util.*;
//Daniel Smith
//06/17/2020
//Objective:
//Given the meal price , tip percent , and tax percent
// for a meal, find and print the meal's total cost. Use Scanner to get your meal,
//your tip percentage and your tax rate (in whole numbers)
//Pseudocode:
//import scanner
//create line.out saying what is your meal price
//create double "mealprice" that will be your base cost
//use the scanner to allow for input for this cost
//create line.out saying what is your tip percentage
//create double "tipPercent"
//use scanner to allow for input for this value
//create line.out saying what is your tax rate in a integer value?
//create double taxRate
//use scanner to allow for input on this
//create a equation to figure the tip cost
//create an equation to find the tax cost
//create an equation adding all 3 values up
//printf the total to the nearest whole number
public class OperatorsChallenge {

    public static void main(String [] args) {
        solve();
    }

        public static void solve(){
            Scanner input = new Scanner(System.in);
            double mealPrice;
            double tipPercent;
            double taxRate;

// i decided to switch int tippercent to a double because it wasnt functioning properly


            System.out.println("Please enter the price of your meal:");
            mealPrice = input.nextDouble();

            System.out.println("Please enter your tip percentage as an integer:");
            tipPercent = input.nextInt();

            System.out.println("Please enter your tax rate as an integer:");
            taxRate = input.nextInt();

            double tipTotal = tipPercent / 100 * mealPrice;
            double taxTotal = taxRate / 100 * mealPrice;

            double total = tipTotal + taxTotal + mealPrice;
            System.out.print("Your total price is: ");
            System.out.printf("\n%1.0f $", total);
        }


}
