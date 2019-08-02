/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
            System.out.println("Waiter Released");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}