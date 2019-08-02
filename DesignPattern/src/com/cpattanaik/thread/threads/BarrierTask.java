/**
 * 
 */
package com.cpattanaik.thread.threads;

import java.util.concurrent.CyclicBarrier;

class BarrierTask implements Runnable {

    private CyclicBarrier barrier;

    public BarrierTask(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (Exception ex) {
            ex.getStackTrace();
        } 
    }
}