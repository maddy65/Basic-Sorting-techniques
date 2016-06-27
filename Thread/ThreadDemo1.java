package Thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		Thread T = new Thread(mt);
		T.start();
	}

}
