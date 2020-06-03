import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        final double rate=1+0.003125;
        double amount=input.nextDouble();
        double firstMonth=100*rate;
        double secondMonth=(100+firstMonth)*rate;
        double thirdMonth=(100+secondMonth)*rate;
        double fourthMonth=(100+thirdMonth)*rate;
        double fifthMonth=(100+fourthMonth)*rate;
        double sixthMonth=(100+fifthMonth)*rate;
        System.out.println("Firth Month "+fifthMonth);
        System.out.println("Second Month "+secondMonth);
        System.out.println("Third Month "+ thirdMonth);
        System.out.println("Sixth Month "+ sixthMonth);
    }
}
