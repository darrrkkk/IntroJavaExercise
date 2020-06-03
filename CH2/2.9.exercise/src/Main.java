import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter V0, V1 and t: ");
        double v0=input.nextDouble();
        double v1=input.nextDouble();
        double t=input.nextDouble();
        double result = Math.abs((v0-v1) / t) ;
        System.out.println(result);
    }
}
