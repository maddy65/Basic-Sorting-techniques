package Thread;
import java.io.*;

public class ThreadrDemo2 {

	public static void main(String[] args) throws IOException{
		MyThread2 Obj = new MyThread2();
		Thread t = new Thread();
		t.start();
		System.in.read();
		Obj.stop=true;

	}

}
