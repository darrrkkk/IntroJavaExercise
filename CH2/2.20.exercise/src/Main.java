import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter balance and annual percentage interest rate:");
        double balance = input.nextDouble();
        double annualRate = input.nextDouble();
        double interest=balance * (annualRate/1200);
        System.out.println(interest);
    }
}
