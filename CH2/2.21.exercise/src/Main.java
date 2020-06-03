import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double inverstmentAmount=input.nextDouble();
        System.out.println("Enter annual interest rate in percentage:");
        double rate=input.nextDouble();
        rate=rate/100/12;
        System.out.println("Enter number of years:");
        double years=input.nextDouble();

        double furtureMoney= inverstmentAmount*(Math.pow((1+rate), years*12));
        System.out.println(furtureMoney);
    }
}
