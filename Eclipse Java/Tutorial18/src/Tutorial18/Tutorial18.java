package Tutorial18;

class Thing {
	public String name;
	public static String description; //class variable ; that is why you invoke using the class
	public final static int Lucky_Number = 7;
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		 count++;
	}
	
	public void showName () {
		System.out.println("Object id: " + id + ", " + description + " : " + name );
	}
	
	public static void showInfo() {
		System.out.println("Hello");
	}
}

public class Tutorial18 {
	
	public static void main(String[] args) {
	
		System.out.println("Before creating objects, count is : " + Thing.count);

		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		Thing.description = "I am a thing";
		
		System.out.println("Before creating objects, count is : " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		 System.out.println(thing1.name);
		 System.out.println(thing2.name);
		 System.out.println(Thing.description);
		 
		 thing1.showName();
		 thing2.showName();
		 Thing.showInfo();
		 
		 System.out.println(Math.PI);
		 
		 System.out.println(Thing.Lucky_Number);
	}

}
