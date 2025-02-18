package myPackage;
import java.util.Scanner;
public class Jat_task4_p4 {

	public static void main(String[] args) {
		// Write a Java program to get 2 numbers from the user 
		//and swap their values without any loss of data. 
		//You can make use of an additional variable for swapping. 
		//Print the corresponding swapped values of the two numbers as output in the console.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1= scanner.nextInt();
		System.out.println("Enter the second number");
		int number2= scanner.nextInt();
		System.out.println("You Entered " +number1 +" as first number");
		System.out.println("You Entered " +number2 +" as second number\n");
		int number3=number2;
		number2=number1;
		number1=number3;
		System.out.println("I Swapped both numbers\n");
		System.out.println("Now the first number is  ::" +number1);
		System.out.println("And the second number is ::" +number2);
				
		
	}

}
