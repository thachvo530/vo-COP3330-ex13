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

        System.out.print("What is the principal amount? ");
        Scanner principal = new Scanner(System.in);
        int principal1 = principal.nextInt();

        System.out.print("What is the rate? ");
        Scanner rate = new Scanner(System.in);
        double rate1 = rate.nextDouble();

        System.out.print("What is the number of years? ");
        Scanner years = new Scanner(System.in);
        int years1 = years.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        Scanner compound = new Scanner(System.in);
        int compound1 = compound.nextInt();

        double total = principal1 * Math.pow(( 1 + ((rate1 / 100) / compound1)), (compound1 * years1));
        DecimalFormat df = new DecimalFormat(".00");

        System.out.print("$"+principal1+" invested at "+rate1+"% for "+years1+" years compounded "+compound1+" times per year is $"+df.format(total)+". ");
    }
}
