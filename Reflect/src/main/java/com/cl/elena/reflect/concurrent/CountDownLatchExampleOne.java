package com.cl.elena.reflect.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExampleOne {

	public CountDownLatchExampleOne() {
		// TODO Auto-generated constructor stub
	}
	
	private final static int threadCount = 10;
	public static void main(String arg[]) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
		for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
            	try {
                    test(threadNum);
                } catch (Exception e) {
                    System.err.println("exception : {" + e + "}");
                } finally {
                    countDownLatch.countDown();
                }
            });
		}
        countDownLatch.await();
        System.out.println("finish");
        executorService.shutdown();
	}
	
    private static void test(int threadNum) throws Exception {
        Thread.sleep(100);
        System.out.println("{" + threadNum + "}");
        Thread.sleep(100);
    }


}
