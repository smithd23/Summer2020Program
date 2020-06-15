//import scanner
//start new class called "AskLetters"
//start a main
//in this main i will write to different strings, ask and answer
//in the ask method i will write the question, summon the scanner and name it(making it so that the user can input info) , create variables
//and use index to determine the dif between word 1 and word 2(before index= word 1)
// later in this method i will include a for loop which goes through the phrase and determines letter by letter if they are in the phrase.
//if they are in the phrase, their will be another for loop which will count the amount of each letter.
// in the answer method, i will deliver this information with a system out print and a statement saying "this is the amount of [letter]"
//then i will finish the program
//package com.company;
//import java.util.*;
////this brings in a scanner, which we can use to input information into the finished code
//
////Daniel
////My plan is to ask for the phrase, use the index to create seperate strings for dif words
//// then i will use a for loop to run and count each character. this will determine if there are multiple of one letter
////then i will use a phrase to state this using a variable i will create called "letter"
//
//
package com.company;
import java.util.*;
public class AskLetters {
    public static String firstWord;
    public static int indexOf;
    public static char letter;


    public static void main(String[] args) {
        //this is my main String which will run my methods when they are done.
        Ask();
    }
    public static void Ask() {
        // this is my method that will ask the user what their phrase is,and it will compute the amount of each letter used.
        //Ask user for phrase
        System.out.print("Please Enter Your Phrase:");
        //this is the bot that I am using and I named it "Bot"
        Scanner Bot = new Scanner(System.in);
        //Here I create a new String called "phrase" that =s the scanner.next line.
        String phrase = Bot.nextLine();
        //here I am creating a new integer called "indexOf" this is equal to the space after the first word that the user inputs.
        int indexOf = phrase.indexOf(" ");
        //this is the same but for the first word
        firstWord = phrase.substring(0, indexOf + 1);
        //right here i am trying to get it to test every letter to see if it is in the phrase, but i dont know how
        //to make it so that it will count a specific letter
        char letter = ' ';
        int count = 0;
        CountingLettersFW(letter,phrase, count);
    }
    public static void CountingLettersFW(char letter,String phrase, int count) {
        for (int i = 0; i < firstWord.length(); i++) {

            letter = firstWord.charAt(i);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(i + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                phrase= phrase.replace(letter, ' ');
                if(count>1) {
                    System.out.println(count +" " + letter + "'s");
                }
                if(count<=1){
                    System.out.println(count + " " +letter);
                }
                count= 0;
            }

        }
    }
}




        //use variable "letter"
        //  letter= firstWord.charAt(indexOf "your loop"
        //count++
        //index=firstWord.substring(loop index +1).indexOf(letter);
        //while(index>0){
        //count++
        //delete that letter from firstWord
        //}
        //print your letter and count
        //count equals zero
        //repeat loop


//            I think this should work, because it will test every letter. I might have to include the ASCII numbers for the lower case letters.
//             I am using Char and a for loop here because the numbers should be turned into letters


        //   System.out.println("There are " + count + letter + "'s");




    //Here  i want the code to count the amount of letters in the phrase because this will help narrow down the maximum number of a single letter possible

//this is where I print the results, It


    //this is the code that will present the answer to the user through System.out and other lines

    //this is where I print the results, It should be connected to the count and letter variable though.
//            System.out.println("There are " + count + letter + "'s");

//end main





