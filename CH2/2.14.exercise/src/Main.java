import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds and height in inches");
        double pound=input.nextDouble();
        double inches=input.nextDouble();
        double kilograms=pound*0.45359237;
        double meters=inches*0.0254;
        double bmi= kilograms/Math.pow(meters,2);
        System.out.println(bmi);
    }
}
