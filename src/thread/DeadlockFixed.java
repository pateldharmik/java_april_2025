package thread;

public class DeadlockFixed {

	public void deadlockFixedDemo() {

		Object obj1 = new Object();
		Object obj2 = new Object();

		Runnable r1 = () -> {
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName() + " is holding object1.");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {}
				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + " is holding object2.");
				}
			}
		};

		Thread t1 = new Thread(r1,"Thread 1");
		Thread t2 = new Thread(r1,"Thread 2");

		t1.start();
		t2.start();
	}
}
