package myPackage;
import java.util.Scanner;
public class Jat_task4_p1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a Java program that declares four integer variables: a, b, c, and d. 
		//Then, write an if statement that checks whether the sum of a and b is greater than the sum of c and d. 
		//If the condition is true, the program should output a message indicating that the sum of a and b is greater than the sum of c and d.
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a value for a");
		int a = scanner.nextInt();
		System.out.println("Enter a value for b");
		int b = scanner.nextInt();
		System.out.println("Enter a value for c");
		int c = scanner.nextInt();
		System.out.println("Enter a value for d");
		int d = scanner.nextInt();
		int sum1=a+b;
		int sum2=c+d;
		if(sum1>sum2)
			System.out.println("The sum of a and b is greater than sum of c and d");
		scanner.close();
	}

}
