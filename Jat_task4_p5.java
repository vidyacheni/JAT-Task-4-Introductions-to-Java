package myPackage;
import java.util.Scanner;

public class Jat_task4_p5 {
	public static void main(String[] args) {
		// Write a program to print if a number is prime or not
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number. I will check if it is a Prime Number");
		int number1=s.nextInt();
		//to check if it is a prime number it must be divisible by itself and 1 only
		//from 1 till that number it must not have any other factors
		if(number1<1)
		{
			System.out.println("I checked. ALAS !! The number that you entered is not Prime Number");
		}
		boolean isPrime=true;
		for(int i=2;i<number1;i++)
		{
			//divide number by 1, then increase till i get till the number
			if(number1%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.println("I checked. The number that you entered is a Prime Number. HURRAY ");
		}
		else
			System.out.println("I checked. ALAS !! The number that you entered is not Prime Number");

	}

}
