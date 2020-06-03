


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer between 0-1000");
        int number=input.nextInt();
        int sum=1;
        int digit=1;
        while(number>0){
             digit=(number%10)*digit;
             number=number/10;

        }
        System.out.println(digit);
    }
}
