package thread;

public class Deadlock {

	public void deadlockDemo() {
		Object obj1 = new Object();
		Object obj2 = new Object();

		Thread t1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName() + " is holding object1.");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + " is waiting for object2.");
				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + " is holding object2.");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName() + " is holding object2.");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + " is waiting for object1.");
				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName() + " is holding object1.");
				}
			}
		});

		t1.start();
		t2.start();

	}
}
