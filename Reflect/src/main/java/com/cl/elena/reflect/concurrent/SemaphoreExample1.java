package com.cl.elena.reflect.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreExample1 {

	private final static int threadcount = 200;
	
	public static void main(String args[]) {
		ExecutorService exec = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(3);
		for (int i = 0; i < threadcount; i++) {
            final int threadNum = i;
            exec.execute(() -> {
                try {
                    if (semaphore.tryAcquire(5000, TimeUnit.MILLISECONDS)) { // 尝试获取一个许可
                        test(threadNum);
                        semaphore.release(); // 释放一个许可
                    }
                } catch (Exception e) {
                    System.err.println("exception" + e);
                }
            });
		}
        exec.shutdown();		
	}
	
    private static void test(int threadNum) throws Exception {
        System.out.println("{" + threadNum + "}");
        Thread.sleep(1000);
    }

	
}
