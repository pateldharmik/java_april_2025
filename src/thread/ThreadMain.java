package thread;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
/*

		//Thread creation -- 2 ways to create a thread.
		//1. By extending Thread class.
		//In this method we have to override the run method of Thread class for the thread implementation.
		Thread tA = new Thread() {
			public void run() {
				System.out.println("Thread A is running...");
			}
		};

		//2. By implementing Runnable interface
		Runnable r = () -> System.out.println("Thread B is running...");
		Thread tB = new Thread(r);


		//threadName.start() will start the execution of the thread.
		tA.start();
		tB.start();

*/


		/* wait() and notify() demo
		ThreadDemo shared = new  ThreadDemo();
		Thread waiter = new Thread(()-> {
			try {
				shared.waitForSignal();
			} catch (InterruptedException e) {}
		}, "Waiter");

		Thread sender = new Thread(()-> {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			shared.sendSignal();
		}, "Sender");


		Thread tJoin = new Thread(()-> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Working on Step: " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {}
			}
		});

		waiter.start();
		sender.start();
		tJoin.start();

		waiter.join();
		sender.join();
		tJoin.join();
		System.out.println("Main thread continues after Join.");
		*/

		//Deadlock Example
		/*
		Deadlock deadlock = new Deadlock();
		deadlock.deadlockDemo();
		*/

		//Deadlock fixed Example
		DeadlockFixed dlf =  new DeadlockFixed();
		dlf.deadlockFixedDemo();
	}
}
