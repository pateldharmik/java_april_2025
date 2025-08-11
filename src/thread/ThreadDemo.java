package thread;

public class ThreadDemo {

	boolean flag = true;

	//synchronized keyword is used for methods so that only one thread has the access to the method at a time.
	//"IllegalMonitorStateException" is thrown when synchronized is not used.
	synchronized void waitForSignal() throws InterruptedException {
		while (flag) {
			System.out.println(Thread.currentThread().getName() + " is waiting to finish.");
			wait();        //---> thread will have to wait to resume execution until notify() is called.
		}
		System.out.println(Thread.currentThread().getName() + " got the signal to continue running.");
	}

	synchronized void sendSignal() {
		flag = false;
		System.out.println(Thread.currentThread().getName() + " sending signal to finish.");
		notify();
	}
}