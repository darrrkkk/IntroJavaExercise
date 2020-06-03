import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("enter temperature in F");
        double temp=input.nextDouble();
        System.out.println("enter the wind speed in mile per hour ");
        double speed=input.nextDouble();
        double windChill=35.74+0.6215*temp-35.75*(Math.pow(speed,0.16))+0.4275*temp*(Math.pow(speed,0.16));
        System.out.println(windChill);

    }
}
