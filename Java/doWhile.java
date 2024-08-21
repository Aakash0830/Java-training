package practice;

import java.util.Scanner;

public class doWhile {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number:");
		int i=sc.nextInt();
		do{
			System.out.println(i);
			i--;
		}while(i>=1);
	}
}
