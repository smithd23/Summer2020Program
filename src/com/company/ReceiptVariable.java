package com.company;
//Daniel
public class ReceiptVariable {
        public static void main(String[] args) {

            // Calculate total owed, assuming 8% tax / 15% tip

            System.out.println("Subtotal:");
            int subtotal= 38 + 40+ 30;
            System.out.println("Subtotal:"+ subtotal);
            System.out.println("Tax:");
            double tax= subtotal*.08;
            System.out.println("Tax:"+ tax);
            System.out.println("Tip:");
            double tip= subtotal*.15;
            System.out.println("Tip:"+ tip);
            System.out.println("Total:");
            double total= tax+tip+subtotal;
            System.out.println("Total:"+ total);
        }
    }

