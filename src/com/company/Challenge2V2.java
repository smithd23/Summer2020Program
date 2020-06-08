package com.company;
/*Daniel Smith wrote this */
/* This version of Challenge 2 we are trying to use for loops to automatically make the pyramid instead of having to do it manually*/
public class Challenge2V2 {
    public static final int SIZE=4; //Declares a Global Constant
     public static void main(String[] args) {
         Line();
         Small2Big();
         Big2Small();
         Line();
         Big2Small();
         Small2Big();
         Line();

     }
     // this is the method that creates the line.
    public static void Line() {
        System.out.print("+");
        for(int dash=0; dash<9; dash++ ){
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Small2Big() {
        for (int line = 1; line <5; line++) {
            System.out.print("|");
            for (int space = 1; space <= -1 * line + 5; space++){
                System.out.print(" ");
            }
            for (int slash = 1; slash <= 1 * line - 1; slash++){
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 1; backslash <= 1 * line -1; backslash++){
                System.out.print("\\");
            }

            for (int space = 1; space <= -1 * line + 5; space++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }



        }
        public static void Big2Small(){
            for (int line = 1; line <5; line++) {
                System.out.print("|");
                for (int space = 1; space <= 1 * line + 0; space++) {
                    System.out.print(" ");
                }
                for (int backslash = 1; backslash <= -1 * line + 4; backslash++){
                    System.out.print("\\");
                }
                System.out.print("*");
                for (int slash = 1; slash <= -1 * line + 4; slash++){
                    System.out.print("/");
                }
                for (int space = 1; space <= 1 * line + 0; space++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }

        }
    }