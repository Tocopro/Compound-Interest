package com.company;
import java.util.Scanner;

public class Main {
    // class to calculate interest from provided arguments

    public void calculate(int p, int t, double r, int n)
    {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("Compound Interest after " + t + " years: $" + String.format("%.2f", interest));
        System.out.println("Amount after " + t + " years: $" + String.format("%.2f", amount));

    }
    // main function to pass the values used in the arguments

    public static void main(String[] args)
    {
        Main object = new Main();
        object.calculate(2000, 5, 0.09, 12);

    }
}

