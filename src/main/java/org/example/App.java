/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */


package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = scan.nextInt();

        System.out.print("What is the rate? ");
        double rate = scan.nextDouble();

        System.out.print("What is the number of years? ");
        int years = scan.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = scan.nextInt();

        double total = principal * Math.pow(( 1 + ((rate / 100) / compound)), (compound * years));
        DecimalFormat df = new DecimalFormat(".00");

        System.out.print("$"+principal+" invested at "+rate+"% for "+years+" years compounded "+compound+" times per year is $"+df.format(total)+". ");

    }
}
