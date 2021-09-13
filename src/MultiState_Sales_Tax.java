/*
 *  UCF COP3330 Fall 2021 Assignment 1.20 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class MultiState_Sales_Tax {
    public static void main(String [] arg){
        System.out.print("What is the order amount? ");
        Scanner amtInp = new Scanner(System.in);
        double orderAmt = amtInp.nextInt();

        System.out.print("What is the name of the state that you live in? ");
        Scanner stateInp = new Scanner(System.in);
        String state = stateInp.nextLine();
        double taxrate = .05;


        if(state.equals("Wisconsin"))
            System.out.print("What county do you live in? ");
            Scanner countyInp = new Scanner(System.in);
            String county = countyInp.nextLine();

            if(county.equals("Eau Claire"))
                taxrate = .055;


            if(county.equals("Dun"))
                taxrate = .054;


        if(state.equals("Illinois"))
            taxrate = .08;

        double tax = (orderAmt * taxrate);
        double total = orderAmt + tax;

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, total);


    }
}
