import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the subtotal ");
        double subtotal=input.nextDouble();
        System.out.println("Enter the gratuity rate");
        double gratuityRate=input.nextDouble();

        double gratuity= gratuityRate/subtotal;
        double total=subtotal+gratuity;
        System.out.println("The gratuity is $"+ gratuity+" and total is "+total);
    }
}
