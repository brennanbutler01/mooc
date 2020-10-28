package Tutorial9;

import java.util.Scanner;

public class Tutorial9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter a command: ");
		
		String text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Machine Started");
			break;
			
		case "end" : 
			System.out.println("Machine powering down");
			break;
			
		default: 
			System.out.println("Please enter another command, command not recognized");
		
		}
		

	}

}
