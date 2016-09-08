package tw.org.iii.java2.allan;

import java.util.Timer;
import java.util.TimerTask;


public class Allan46 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask task1 = new MyTask("A");
		MyTask task2 = new MyTask("B");
		timer.schedule(task1, 0, 500);
		timer.schedule(task2, 0, 300);
	}
}
class MyTask extends TimerTask {
	private String name;
	private int i;
	MyTask(String name){this.name = name;}
	@Override
	public void run() {
		System.out.println(name + ":" + i++);
	}
}

