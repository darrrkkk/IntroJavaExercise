import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes=input.nextInt();
        int days= minutes/1440;
        int years=days/365;
        int remainingDays=days%365;
        System.out.println(minutes+" minutes is approximately "+ years+" years and "+ remainingDays+ " days");

    }
}
