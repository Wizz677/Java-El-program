class thread1 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
                System.out.println("Thread1:" +i);			
				Thread.sleep(2000);
				Thread.yield();
			}
		}catch(InterruptedException e) {
				System.out.println(e);
		}
			System.out.println("Thread1 finished:");
	}
}
class thread2 extends Thread{
	public void run() {
		try {
			for(int i=10;i<=15;i++) {
				  System.out.println("Thread 2: " +i);
                  Thread.sleep(1000);
                  Thread.yield();
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread2 finished");
	}
}

public class threadlife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		System.out.println("Before start");
		System.out.println("Thread1 state:" +t1.getState());
		System.out.println("Thread2 state" +t2.getState());
		t1.start();
		t2.start();
		System.out.println("After start");
		System.out.println("Thread1 state" +t1.getState());
		System.out.println("Thread2 state" +t2.getState());
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("After completetion.");
		System.out.println("Thread1 state:" +t1.getState());
		System.out.println("Thread2 state:" +t2.getState());

	}

}
