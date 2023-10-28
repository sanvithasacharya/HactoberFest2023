package PRACTICE;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0,b=0,result;
		Scanner userInput=new Scanner(System.in);
		try {
			System.out.println("Enter the two values: ");
			 a = userInput.nextInt();
			 b =userInput.nextInt();
		}catch(Exception e) {
			System.out.println("Invalid values");
		}
			 try {
				 result = a/b;
				 System.out.println("The resulr is :" +result);
			 }catch(Exception e) {
				 System.out.println("Division not possible");
		}

	}

}
