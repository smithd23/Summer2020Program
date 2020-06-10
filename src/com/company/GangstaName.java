package com.company;

import java.nio.file.FileSystemNotFoundException;
import java.util.*;
public class GangstaName {
    //How to use the Scanner to get user input
    public static void main(String[] args) {
      // to create a scanner object and give it a name
        Scanner Bobert= new Scanner(System.in);
        System.out.println("Type your name playa: ");
        String name=Bobert.nextLine();
        String firstname = name.substring(0, name.indexOf(" "));
        String lastname = name.substring(name.indexOf(" ")+1);
        String lastUp = lastname.toUpperCase();
        String firstInitial = firstname.substring(0, 1);
        //now print final
        System.out.println("Your gangsta name is: " + firstInitial+"." + " Diddy "+ lastUp + " " + firstname + "-izzle");



    }
}
