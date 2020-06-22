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
          String userString = " ";
          int T;
          do{
          System.out.print("Please input the amount of words you are going to use. (Has to be between 2 and 10): ");
           T = input.nextInt();//this is the amount of words
      }while (T < 2 && T > 10);//limits the amount
          int len;//declares length
              for (int i = 0; i < T; i++) {
                  do {
                      System.out.println("Please enter your phrase: ");
                      userString = input.next();//reads next word
                      len = userString.length();//shorter abbreviation for easier use
                  } while (len < 2 && len > 10000);//this limits the values to inbetween these 2 numbers
                  String divide = divide(userString);
                  System.out.println(divide);
              }
          }


              //here i should print the method divided


              public static String divide(String userString) {
                  String even= " ";
                  String odd= " ";
                  char letter;
                  char letter2;
                  for(int evens=0; evens<userString.length();evens+=2){
                       letter=userString.charAt(evens);
                       even=even+letter;
                  }
                  for(int odds=1; odds<userString.length();odds+=2) {
                      letter2 = userString.charAt(odds);
                      odd = odd + letter2;
                  }
                  String done;
                  done = (even+" "+ odd);
                  return done;//this returns it
              }
          }
