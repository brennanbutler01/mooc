package Tutorial6;

public class Tutorial6 {
	public static void main (String[] args) {
		
		int loop = 0;
		
		while (true) {
			System.out.println("LOOPING " + loop);
			
			if (loop ==5) {
				break;
			}
			loop++;
			
			System.out.println("Running");
		}
		
	}
}