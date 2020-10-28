package Tutorial20;

class Frog {
	
	private String name;
	private int id;
	
	public Frog (int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString(); */
		
		return String.format("%-4d: %s", id, name);
	}
}

public class Tutorial20 {
	
		public static void main(String[] args) {
			Object obj = new Object();
			
			Frog frog1 = new Frog(7, "Freddie the Frog");
			Frog frog2 = new Frog(5, "Rodger");

			
			System.out.println(frog1.toString());
			System.out.println(frog2);
		}

}
