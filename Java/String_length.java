package practice;

import java.util.Scanner;

public class String_length {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Name:");
	  String name=sc.nextLine();
	  System.out.println("The Length of your name is:"+ name.length());
  }
}
