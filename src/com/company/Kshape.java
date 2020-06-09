package com.company;
public class Kshape {
    public static final int SIZE=25;
    public static void main(String[] args) {
        TopPart();
        BottomPart();



    }
    public static void TopPart(){
        char letter = 65;
        for(byte count=SIZE; count>=0; count--){
            for (byte count2 = 0; count2 <= count; count2++) {
                System.out.print((char) (letter + count2) + " ");

            }
            System.out.println("");


        }

    }
    public static void BottomPart(){
        char letter = 65;
        for (byte count = 0; count <= SIZE; count++) {
            for (byte count2 = 0; count2 <= count; count2++) {
                System.out.print((char) (letter + count2) + " ");
            }
            System.out.println("");
        }
    }


}
