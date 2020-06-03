/*
Write a program that reads a mile in a double value from the console,
converts it to kilometers, and displays the result.
The formula for the conversion is as follows:
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles=input.nextDouble();
        double kilmoters=miles*1.6;
        System.out.println(miles+" miles is "+kilmoters+" kilometers.");
    }
}
