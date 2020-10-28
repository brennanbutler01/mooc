package Tutorial13;

class Person {
	//instance variables = data or state
	String Name; 
	int Age;
	
	
	
	//classes can contain
	
	//1. data
	//2. methods/subroutines
	
}

class Basil {
	
	String FavoriteFood;
	int Age;
	boolean Pregnant;
	void speak() {
		System.out.println("Hello");
	}
}

class Luther {
	
	String Luthersmom;
	int Age;
	boolean Gay;
	
	void speak() {
		for (int i=0; i<4; i++) {
		System.out.println("Hello, My name is : " + Luthersmom + " and I am " + Age + " years old");
	}
}
public class Tutorial13 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("How are you?");

			Person person1 = new Person();
			person1.Name = "Jim B";
			person1.Age = 40;
			
			Person person2 = new Person();
			
			person2.Name = "Sarah Smith";
			person2.Age = 20;
			
		System.out.println(person2.Age);
			
			Basil basil1 = new Basil();
			basil1.Age = 15;
			basil1.Pregnant = true;
			basil1.FavoriteFood = "Chicken";
			
			System.out.println(basil1.FavoriteFood);
			System.out.println(basil1.Age );
			System.out.println(basil1.Pregnant);
			
		Luther ourboy = new Luther();
		ourboy.Age = 15;
		ourboy.Gay = true;
		ourboy.Luthersmom = "Basil maybe";
		ourboy.speak();
				
				System.out.println(ourboy.Age);
		System.out.println(ourboy.Gay + " he is gay");
		System.out.println(ourboy.Luthersmom);


}
}
