import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double length=input.nextDouble();
        double area=3*Math.sqrt(3)*Math.pow(length,2)/2;
        System.out.println(area);
    }
}
