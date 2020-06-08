package com.company;
//Daniel
public class ReceiptVariable {
        public static void main(String[] args) {
            //Daniel Smith

            // Calculate total owed, assuming 8% tax / 15% tip


            int subtotal= 38 + 40+ 30;
            System.out.println("Subtotal:"+ subtotal);

            double tax= subtotal*.08;
            System.out.println("Tax:"+ tax);

            double tip= subtotal*.15;
            System.out.println("Tip:"+ tip);

            double total= tax+tip+subtotal;
            System.out.println("Total:"+ total);
        }
    }

