/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        double tax = 0;
        double total = 0;
        boolean taxed = true;

        System.out.print("What is the order amount? ");
        double amount = in.nextDouble();
        System.out.print("What state do you live in? ");
        String state = in.next();
        System.out.print("What county do you live in? ");
        String county = in.next();

        if (state.equals("Wisconsin")){
            if (county.equals("Eau Claire")){
                tax = Math.round(0.055*amount*100.0)/100.0;
                total = amount+tax;
            }
            else if (county.equals("Dunn")){
                tax = Math.round(0.054*amount*100.0)/100.0;
                total = amount+tax;
            }
            else{
                tax = Math.round(0.05*amount*100.0)/100.0;
                total = amount+tax;
            }
        }
        else if (state.equals("Illinois")){
            tax = Math.round(0.08*amount*100.0)/100.0;
            total = amount+tax;
        }
        else{
            taxed = false;
            total = amount;
        }

        String output = taxed
                ? "The tax is $"+tax+".\nThe total is $"+total+"."
                : "The total is $"+total+".";
        System.out.println(output);
    }
}
