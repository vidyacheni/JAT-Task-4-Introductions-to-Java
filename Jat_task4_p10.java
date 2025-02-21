package myPackage;
import java.util.Scanner;
public class Jat_task4_p10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Write a program to count number of digits in an integer
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=s.nextInt();
		int count=0;
		int temp=Math.abs(number);
		
		while (temp>0)
		{
			int newtemp=temp/10;
			temp=newtemp;
			count++;
		}
		
		if(number==0)
		{
			count=1;
		}
		System.out.println("Your number contains " + count + " digits. A small but mighty figure!");
		s.close();
	}

}
