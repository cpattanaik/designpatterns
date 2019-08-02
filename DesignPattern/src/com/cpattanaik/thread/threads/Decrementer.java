/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }
    public void run() {

        try {
            Thread.sleep(1000);
            latch.countDown();
            System.out.println("Latch is down by one");
            
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("Latch is down by one");

            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("Latch is down by one");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}