package practice;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmStrongNumber(int number)
      {
    	  String digits =Integer.toString(number);
    	  int numDigits=digits.length();
    	  int sum=0;
    	  for(int i=0;i<numDigits;i++) {
    		  int digit=Character.getNumericValue(digits.charAt(i));
    		  sum+=Math.pow(digit, numDigits);
    	  }
    	  return sum==number;
      }
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter any number:");
			int number=scanner.nextInt();
			if(isArmStrongNumber(number)) {
				System.out.println(number+" is a Armstrong number");
			}
			else {
				System.out.println(number+" is not a Armstrong Number");
			}
		}
	}


