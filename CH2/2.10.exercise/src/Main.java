import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double water=input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp=input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        double Q= Math.abs(water*(initialTemp-finalTemp)*4184);
        System.out.println(Q);
    }
}
