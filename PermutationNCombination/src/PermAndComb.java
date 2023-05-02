import java.util.Scanner;

public class PermAndComb {
	
	private static Scanner scan;
	//Factorial of a number Calculation logic	
	public static int factorial(int num) {
		int fact= 1;
		for (int i= 1; i<= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	// Main method to run the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r;
		//Taking Input logic
		scan = new Scanner(System.in);
		System.out.print("Enter Value of n : ");
		n = scan.nextInt();
		System.out.print("Enter Value of r : ");
		r = scan.nextInt();
		if ((n < 0 || r < 0 ) && (n >= r)) {
			System.out.println("please enter correct value of n & r as n ≥ r ≥ 0");
		} else {
			//Permutation and Combination Calculation logic
			int perm = (factorial(n) / (factorial(n - r)));
			int comb = (factorial(n) / (factorial(n - r) * factorial(r)));
			// Printing results
			System.out.println("******* RESULTS *******");
			System.out.println("Permutation(nNPR) of the number = " +perm);
			System.out.println("*********************************************");
			System.out.println("Comination(NCR) of the number = " +comb);
		}
	}

}
