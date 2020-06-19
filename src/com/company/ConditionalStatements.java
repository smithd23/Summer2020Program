package com.company;
import java.util.Random; //this will help me limit range of random
import java.util.*;
//Daniel
//06/18/2020
//bring scanner in
//create main class
//create a method
//in this method create a scanner and a expression asking if you want to start
//under the expression set the scanner equal to the input
//create an if saying if the string contained yes it will start
//if contains no end the program
//in the if create two seperate for loops, evens and odds
//this will define your numbers
//in evens use the for loop evens = 0; evens<=136; evens+=2
//do same with odd but starting at 1 and ending at 137
//in odd create an if statement saying if the number used is odd,
//in the if write that is weird
//in the even one create three different if statements on the 2 to 5 the 6 to 20 etc
//in these print the corresponding that is weird statements
//after all of this write the method name to loop back to the start.
public class ConditionalStatements {
    public static void main(String[] args) {
        Weird();
    }
    public static void Weird(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to start? (Yes or No): ");
        String yesorno= scan.next();

        if(yesorno.contains("Yes")){
            System.out.println("Great you have chosen to play the game!");
            System.out.println("Please choose a whole number between 1 and 137:");
            int numberchosen= scan.nextInt();
            for(int even=0; even<=136; even+=2){
                if(numberchosen==even) {
                    if (numberchosen >= 2 && numberchosen <= 5) {
                        System.out.println("That is not weird");
                    } else if (numberchosen >= 6 && numberchosen <= 20) {
                        System.out.println("That is weird");
                    } else if (numberchosen > 20) {
                        System.out.println("That is not weird");
                    }
                    System.out.println("Would you like to play again? (Yes or Nah)");
                    String yesv2 = scan.next();
                    if (yesv2.contains("Yes")){
                        Weird();


                    }
                    if(yesv2.contains("Nah")){
                        System.out.println("The End");
                    }

                }

            }

            for(int odd=1; odd<=137; odd+=2){
                if(numberchosen ==odd){
                    System.out.println("That is weird");
                    System.out.println("Would you like to play again? (Yes or Nah)");
                    String yesv2 = scan.next();
                    if (yesv2.contains("Yes")){
                        Weird();
                    }
                    if(yesv2.contains("Nah")){
                        System.out.println("The End");
                    }
                }
            }
        }
        if(yesorno.contains("No")){
            System.out.println("Oh well you missed a fun game. Have a good day.");

        }
    }
}
