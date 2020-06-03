import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number in sqaure");
        double square=input.nextDouble();
        double ping = square * 0.3025;
        System.out.println(square+ " square meter is " + ping +" ping");
    }
}
