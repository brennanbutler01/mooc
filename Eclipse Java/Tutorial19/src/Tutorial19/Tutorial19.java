package Tutorial19;

public class Tutorial19 {
	
	public static void main(String[] args) {
			
		/*    String info = "";
		info += "My name is bob";
		info += " ";
		info += "I am a builder";
		
		System.out.println(info);        */
		
		//more efficient than the above
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Rodger.")
		.append("")
		.append("I am a skydiver");
		System.out.println(s.toString());
		
		StringBuilder a = new StringBuilder();
		a.append("I really want to live in vietnam")
		.append(", I hope before the end of the year.")
		.append("I miss eating banh xeo");
		System.out.println(a.toString());
		
		
		System.out.println("Here is some text. \t That was a tab.\n That was a new line");
		//formatting integers
		System.out.printf("Total cost %-10d; quantity is %d\n",5, 125);
		
		//formatting strings
		for (int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "here is some text");
		}
		//formatting floating points
		System.out.printf("Total value: %.2f\n", 5.6);
		System.out.printf("Total value: %10.9f\n", 5.623423434);

	
	}

}
