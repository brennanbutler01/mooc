package Tutorial17;

class Machine {
	private String name;
	private int code;
	public Machine () {
		this("Arnie",0);
		System.out.println("Constructor Running!");
		
		//name = "Arnie";
		
	}
	
	public Machine (String name) {
		this("Arnie", 0);
		this.name = name;
		System.out.println("Second constructor running");
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		
		System.out.println("Third constructor running");
	}
}

public class Tutorial17 {
	
	public static void main(String[] args) {
		
		//Machine machine1 = new Machine();
		
		//new Machine();
		
		//Machine machine2 = new Machine("Bertie");
		//new Machine("Bertie");
		
		//	Machine machine3 = new Machine ("Johnny", 25);
	}

}
