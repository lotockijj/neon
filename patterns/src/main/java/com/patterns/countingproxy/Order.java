package com.patterns.countingproxy;

public class Order implements Common {

	@Override
	public int getAllOrders() {
		long t1 = System.currentTimeMillis();
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			try {
				Thread.currentThread();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName);
		};
		task.run();
		Thread thread = new Thread(task);
		thread.start();
		long t2 = System.currentTimeMillis();
		long timeDiff = t2 - t1;
		System.out.println("Time: " + timeDiff);
		return 0;
	}

}
