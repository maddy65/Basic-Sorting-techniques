package Thread;

public class Current {

	public static void main(String[] args) {
		System.out.println("Lets find the current Thread");
		Thread t = new Thread();
		System.out.println("Current Thread: "+t);
		System.out.println("Thread name"+t.getName());

	}

}
