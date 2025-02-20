package myPackage;
import java.util.Scanner;
public class Jat_task4_p6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a program to print the factorial of a given number
		System.out.println("Give me a number.I will give it's factorial");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int result=1;
		for(int i=1;i<=number;i++)
		{
			result=result*i;
		}	
		System.out.println("The factorial of "+number +" is "+result);
	
		

	}

}
