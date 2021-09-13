/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static int StringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static float StringToFloat(String str) {
        return Float.parseFloat(str);
    }

    public static void main( String[] args )
    {
        int euros = StringToInt(GetInput("How many euros are you exchanging? "));
        float rate = StringToFloat(GetInput("What is the exchange rate? "));

        float usd = (float)euros * rate;
        double usdRounded = Math.round(usd * 100) / 100d;

        System.out.printf("%d euros at an exchange rate of %.4f is \n%.2f U.S dollars.", euros, rate, usdRounded);
    }
}