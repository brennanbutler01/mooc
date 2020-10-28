package Tutorial15;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println(height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " m in direction " + direction);
	}
}
public class Tutorial15 {
	
	public static void main(String[] args) {
		
		Robot sam = new Robot();
		sam.speak("Hi, I'm Sam");
		sam.jump(15);
		sam.move("West", 12.2);
		
		String greeting = "Hello there";
		
		sam.speak(greeting);
		
		int value = 14;
		sam.jump(value);
	}
	

}

