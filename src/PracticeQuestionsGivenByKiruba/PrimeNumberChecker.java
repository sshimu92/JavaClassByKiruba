package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int number= sc.nextInt();
		
		boolean isPrime= isPrimeNumber(number);
		
		if(isPrime) {
			
			System.out.println(number + " is a prime number ");
		
		}else {
			
			System.out.println(number + " is not a prime number ");}
		}
		
		public static boolean isPrimeNumber(int num) {
			
			if(num<=1) {
				
				return false;
			}
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				
				if(num % i == 0) {
					
					return false;
				}
			}
		
			return true;
		
	}

	
}
