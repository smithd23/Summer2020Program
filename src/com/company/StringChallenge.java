package com.company;
//pseudocode
//  Daniel Smith
//          06/21/2020
//          create scanner
//          create variables
//          Var T, var Word
//          ask user for T
//          while(T>=2 || T<=10)
//          for loop)
//          create a do
//          ask user for word in the do
//          create a while( word.length >=2 || word.length() <= 10000
//          outside of the while create a new string
//          new String dividedword=  which calls return method(word)
//          System.out.println(dividedword
//          end  main
//public static String name
//        {
//        create String even
//        create String odd
//        create char letter
//        create for loop for even
//        for(int even=0; even<=word.length();even+=2);
//        in this for loop i need to make it so that it will compile all the letters that are even indexed
//        make a char variable that will be equal to the charAt(even) of the word
//        make this compile by making it add to itself so variable=variable+letter
//        end for loop
//        print this answer
//        do the same steps above for odd
//        and create variable for the answers of both loops
//        return the method
//        }
//        and in the main print the answers
//        the end?
import java.util.*;
public class StringChallenge {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);//brings in scanner
          String Stringy = " ";
          int T;//defines var T
          do{//do while
          System.out.print("Please input the amount of words you are going to use. (Has to be between 2 and 10): ");
           T = input.nextInt();//this is the amount of words
      }while (T < 2 || T > 10);//limits the amount
          int l;//declares length
              for (int i = 0; i < T; i++) {
                  do {
                      System.out.println("Please enter your phrase: ");
                      Stringy = input.next();//reads next word
                      l = Stringy.length();//shorter abbreviation for easier use
                  } while (l < 2 || l > 10000);//this limits the values to inbetween these 2 numbers
                  String divide = divide(Stringy);
                  System.out.println(divide);//prints the answer
              }
          }
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