package myPackage;
import java.util.Scanner;

public class Jat_task4_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Have a variable store an integer.Create an if statement to find out if it's an even number. Hint : use modulus operator
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number to check if it is even or not");
		int is_even_or_not= scanner.nextInt();
		int result=is_even_or_not%2;
		if(result==0)
		{
			System.out.println("Entered number is an even number");
		}
		scanner.close();

	}

}
