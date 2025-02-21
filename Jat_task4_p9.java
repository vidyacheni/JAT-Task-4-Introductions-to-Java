package myPackage;
import java.util.Scanner;
public class Jat_task4_p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to check whether the person is a senior citizen or not
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter your age, oh wise traveler: ");
		 int age=s.nextInt();
		 if (age >= 60) {
	            System.out.println("Ah, the golden years embrace thee! You walk the path of wisdom and discounts.");
	        } else {
	            System.out.println("Youth still lingers in your veins! The senior scroll is yet to bear your name.");
	        }
	        
	        s.close();
		 
	}

}
