package Tutorial21;

public class Car extends Machine {
	
	public void wipeWindShield() {
		System.out.println("Wiping WindShield");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		// super.start();
		
		System.out.println("Car started");
	}
	
	public void showInfo()
	{
		System.out.println("Car name : " + name);
	}}
	//method overrides the start() method in the parent class (Machine.java)
	/*public void start () {
		System.out.println("Car Started"); */
	//}//
	

