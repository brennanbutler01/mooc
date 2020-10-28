
package Tutorial7;

import java.util.Scanner;

public class Tutorial7 {
	
	public static void main(String[] args) {
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a floating point value" );
		
		//wait for the user to input a double
		double value = input.nextDouble();
		
		//tell them what they entered
		System.out.println(" You entered: " + value);
	}

}
