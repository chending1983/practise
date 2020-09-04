package com.cl.elena.reflect.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {

	public CountDownLatchTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		final CountDownLatch latch = new CountDownLatch(3);
		System.out.println("mater thread running......");
		ExecutorService threadone = Executors.newSingleThreadExecutor();
		threadone.execute(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					System.out.println("subThread" + Thread.currentThread().getName() + "running......");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				latch.countDown();

			}
		});
		threadone.shutdown();
		//第二个子线程执行
        ExecutorService threadtwo = Executors.newSingleThreadExecutor();
        threadtwo.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("subThread: "+Thread.currentThread().getName()+"runnig......");
                latch.countDown();
            }
        });
        threadtwo.shutdown();
        
      //第二个子线程执行
        ExecutorService threadthree = Executors.newSingleThreadExecutor();
        threadthree.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("subThread:"+Thread.currentThread().getName()+"running......");
                latch.countDown();
            }
        });
        threadthree.shutdown();
        System.out.println("three subthread is runnig over......");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("three subthread over, mater is running");

	}

}
