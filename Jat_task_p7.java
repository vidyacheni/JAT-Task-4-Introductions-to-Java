package myPackage;
import java.util.Scanner;
public class Jat_task_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print the length of the given string  string msg ="Guvi Geek"
		Scanner s = new Scanner(System.in);
		System.out.print("I am the guardian of words, the keeper of length! Speak thy string: ");
        String msg = s.nextLine();  
        System.out.println("\nAh! A string so bold, a tale untold!");
        System.out.println("Its length, dear friend, is: " + msg.length());
        System.out.println("Be it short or be it long, in Java, all strings belong!");
		s.close();

	}

}
