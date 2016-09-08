package tw.org.iii.java2.allan;

public class Allan45 {
	public static void main(String[] args) {
		Allan451 obj=new Allan451("A");
		Allan451 obj1=new Allan451("B");
		Allan451 obj2=new Allan451("C");
		Allan452 obj3=new Allan452("D");
		Thread t1 = new Thread(obj3);
		obj.start();
		obj1.start();
		obj2.start();
		t1.start();
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
		}
		System.out.println("main");
		obj1.interrupt();
		obj.interrupt();
		obj2.interrupt();
	}

}
class Allan451 extends Thread{
	String name;
	Allan451(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(name +":"+i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				break;
			}
		}
		
	}
	
}
class Allan452 implements Runnable{
	String name;
	Allan452(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(name +":"+i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				break;
			}
		}
		
	}
	
}