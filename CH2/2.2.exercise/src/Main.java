import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length of the sides and heights of Equilateral triangle:");
        double length=input.nextDouble();
        double area= Math.sqrt(3)/4*Math.pow(length,2);
        double volume=area*length;
        System.out.println("the area of triangle is "+area);
        System.out.println("the volume of triangle is "+volume);
    }
}
