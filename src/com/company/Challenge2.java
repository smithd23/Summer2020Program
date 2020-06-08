package com.company;
/*Daniel Smith wrote this */
public class Challenge2 {
    public static void main(String[] args) {
        Line();
        HigherPyramid();
        LowerPyramid();
        Line();
        LowerPyramid();
        HigherPyramid();
        Line();
    }

    public static void HigherPyramid(){

        System.out.println("|    *    |");
        System.out.println("|   /*\\   |");
        System.out.println("|  //*\\\\  |");
        System.out.println("| ///*\\\\\\ |");
    }
    public static void LowerPyramid(){
        System.out.println("| \\\\\\*/// | ");
        System.out.println("|  \\\\*//  |");
        System.out.println("|   \\*/   |");
        System.out.println("|    *    |");
    }
    public static void Line() {
        System.out.println("+---------+");

    }

}
