import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        double drivingDistance=input.nextDouble();
        System.out.println("Enter miles per gallon:");
        double milePerGallon=input.nextDouble();
        System.out.println("Enter Price per gallon:");
        double pricePerGallon=input.nextDouble();
        double cost=drivingDistance/milePerGallon*pricePerGallon;
        System.out.println("The cost of driving is $"+cost);
    }
}
