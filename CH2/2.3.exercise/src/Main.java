import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value for meter:");
        double meter=input.nextDouble();
        double feet=meter*3.2786;
        System.out.println(meter+" meters is "+feet+" feet");
    }
}
