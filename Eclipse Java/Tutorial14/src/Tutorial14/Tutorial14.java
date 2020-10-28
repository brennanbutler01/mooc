package Tutorial14;

class Person {
	int Age;
	String Name;
	
	void speak() {
		System.out.println("My name is " + Name);
	}
	 /*void calculateYearsToRetirement() {
		int yearsLeft = 65 - Age ; 
		
		System.out.println("Years left until retirement: " + yearsLeft);
	} */
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - Age ; 
		
		// System.out.println("Years left until retirement: " + yearsLeft);
		
		return yearsLeft;
	}
	
	int getAge() {
		
		return Age;
	}
	
	String getName() { 
		
		return Name;
		
	}
}

public class Tutorial14 {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.Name = "Joe";
		person1.Age = 25;
		person1.speak();
		// person1.calculateYearsToRetirement();
		int years = person1.calculateYearsToRetirement();
		int Age = person1.getAge();
		String Name = person1.getName();
		
		System.out.println("Years until retirement: " + years);
		System.out.println("Age : " + Age);
		System.out.println(Name);
	}
}
