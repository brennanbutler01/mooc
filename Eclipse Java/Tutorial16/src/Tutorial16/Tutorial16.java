package Tutorial16;

class Frog {
	String name;
	int age;
	int weight;
	double girth;
	
	public void setGirth (double girth) {
		this.girth = girth;
	}
	
	public double getGirth () {
		return girth;
	}
	public void setName ( String newName) {
		name = newName;
	}
	
	public String getName( ) {
		return name;
	}
	
	public void setAge (int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWeight (int weight) {
		this.weight = weight;
	}
	 
	public int getWeight () {
		return weight;
	}
}
public class Tutorial16 {
	
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		//frog1.age = 15;	
		frog1.setName("bertie");
		System.out.println(frog1.getName());
		frog1.setAge(15);
		System.out.println(frog1.getAge());
		frog1.setWeight(25);
		System.out.println(frog1.getWeight());
		frog1.setGirth(22.2);
		System.out.println(frog1.getGirth());
	}
	
}
