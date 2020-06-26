package com.company;
//pseudocode
//Daniel
//06/24/2020
//import file
//import scanner
//import random
//create a main
//create method
//call method to main
//in main create a file that has your answers
//in method this is where we will ask the player if they want to play (yes no),
//create a string equal to the input.next
//if yes then continue on with game.
//if no close game
//if yes stae the rules of the game
//if yes then create a random variable which will be a random int between 1 and 2
//then create an if which says if 1, system.out.println("Pleas
//create if statement that states if 1, ask user baseball question, else, ask number question
//summon the file
//scan file
//use scanner file and then create a string equal to that
// use if string.contains one of the answers, add one point
//else, ask question(make this so it goes to beginning of process)
//print tally of points at end
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Random;
public class FinalCode {
    public static String stringfile;
    public static  String yesorno;
    public static int points = 0;
    public static int tries = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Ask();
        Ask2();

    }

    public static void Ask() {//first time only
        System.out.println(" ------------------- ");
        System.out.println("/| *   Welcome  *  |\\ ");
        System.out.println("\\|To this cool game|/");
        System.out.println(" ------------------- ");
        System.out.println("Would you like to play the game?(Yes or No): ");
        Scanner scanAsk = new Scanner(System.in);
         yesorno = scanAsk.next();
        if (yesorno.contains("Yes")) {
            System.out.println("Great you have chosen to play the game!");
            System.out.println("There are three categories which you will be asked about.");
            System.out.println("The three categories are sports teams, numbers between 1 and 100, and doubles between 1.0 and 50.0.");
            //rules
            System.out.println("To score a point you need to guess a team or number correctly.");
            System.out.println("This total will be printed when you choose to stop playing.");
            System.out.println("_____________________________________________________");


        }


    }

    public static void Ask2() throws FileNotFoundException {
        File file = new File("/Users/daniel/IdeaProjects/Summer2020/src/com/company/WordGame.txt");
        Scanner scanfile = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        double avg;
        if (yesorno.contains("Yes")) {//if yes starts game
            System.out.println("Would you like to play the Number game, the Sports game, or the Doubles Game?(Number, Sports, or Doubles): ");
            String userChoice = scan.next();//the input the user gives determines which subsection of the code the game runs

            if (userChoice.contains("Sports")) {//chooses sports method
                System.out.println("The topic chosen is: Sports(A lot of Teams)!");
                System.out.println("Please choose any Sports team");
                String userSportsanswer = scan.next();//scans the team inputed and checks it against the txt
                int temp = points;
                while (scanfile.hasNextLine()) {//if there are more lines, this will keep running
                    String stringfile = scanfile.nextLine();//scans the line
                    if (stringfile.contains(userSportsanswer)) {//if it contains useranswer, a point is added
                        points += 1;

                    }
                }
                if (points > temp) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                } else {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                System.out.println("Would you like to play again?:");
                String yesornov2 = scan.next();
                if (yesornov2.contains("Yes")) {
                    Ask2();
                } else {
                    System.out.println("You finished with " + points + " points out of " + tries + " times.");
                     avg = (double)points / (double)tries;
                    System.out.println("You scored a " + avg + " percent score.");
                    System.out.println("Thanks for playing.");
                }
            }



            if (userChoice.contains("Number")) {
                System.out.println("The topic chosen is: Numbers(Between 1 and 100)!");
                System.out.println("Please choose any number");
                String userNumberanswer = scan.next();
                int temp2 = points;
                while (scanfile.hasNextLine()) {
                    String stringfile = scanfile.nextLine();
                    if (stringfile.contains(userNumberanswer)) {//something wrong here, 1 equals 5 points?
                        points+=1;
                    }

                }
                if (points-1== temp2) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points-1>temp2){
                    System.out.println("Wow you found a bonus points number. Great Job!");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points==temp2) {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                System.out.println("Would you like to play again?:");
                String yesornov3 = scan.next();
                if (yesornov3.contains("Yes")) {
                    Ask2();
                } else {
                    System.out.println("You finished with " + points + " points out of " + tries + " times.");
                     avg = (double)points / (double)tries;
                    System.out.println("You scored a " + avg + " percent score.");
                    System.out.println("Thanks for playing.");
                }

            }

            if (userChoice.contains("Doubles")) {//this starts this subection of program
                System.out.println("The topic chosen is: Doubles(Between 1.0 and 50.0)!");
                System.out.println("Please choose any Double");
                String userDoubleanswer = scan.next();
                int temp3 = points;//sets them equal for the sake of the telling if u got it right
                while (scanfile.hasNextLine()) {
                    String stringfile = scanfile.nextLine();//this string runs over the whole program while there are still more lines
                    if (stringfile.contains(userDoubleanswer)) {//if the txt contains the answer the user gives, this runs
                        points += 1;//adds 1 point if correct
                    }
                }
                if (points-1== temp3) {
                    System.out.println("Good Job! Thats a point");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points-1>temp3){
                    System.out.println("Wow you found a bonus points number. Great Job!");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                if(points==temp3) {
                    System.out.println("Whoops you got that wrong");
                    System.out.println("You now have " + points + " points");
                    tries += 1;
                }
                System.out.println("Would you like to play again?:");//asks if you want to play again
                String yesornov4 = scan.next();//scans answer
                if (yesornov4.contains("Yes")) {//if they want to play again it runs the ask2 program again(starts asking again)
                    Ask2();
                } else {
                    System.out.println("You finished with " + points + " points. Out of " + tries + " times.");//prints the point total
                     avg = (double)points / (double)tries;//calculates percentage correct
                    System.out.println("You scored a " + avg + " percent score.");//prints avg
                    System.out.println("Thanks for playing.");


                }

            }
        }else {
                System.out.println("Your score is: " + points + " and you tried playing " + tries + " times.");//points will be declared
//not really necessary since they havent even played
                System.out.println("Goodbye");
            }
        scanfile.close();
    }
}

