package com.company;
//so this file will be like the other, except i will try and make it broader so i can input different prices.
// this is for fun and not an assignment
public class ReceiptVariableV2 {
    public static final double COST1=15;
    public static final double COST2=41;
    public static final double COST3=17;

    public static void main(String[] args) {
        //Daniel Smith

        // Calculate total owed, assuming 8% tax / 15% tip

        final double TAXRATE= 0.08;
        final double TIPRATE=.15;
        double subtotal= COST1 + COST2+ COST3;
        System.out.println("Subtotal:"+ subtotal);

        double tax= subtotal*TAXRATE;
        System.out.println("Tax:"+ tax);

        double tip= subtotal*TIPRATE;
        System.out.println("Tip:"+ tip);

        double total= tax+tip+subtotal;
        System.out.println("Total:"+ total);
    }

}
