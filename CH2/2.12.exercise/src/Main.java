import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed=input.nextDouble();
        double acceleration=input.nextDouble();
        double length=Math.pow(speed,2)/(2*acceleration);
        System.out.println(length);
    }
}
