package com.mits.transUnion.java_assignment;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicAppTest {
	
    @Test
    public void testAddition() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }
    
    
    @Test
    public void testThreads() throws InterruptedException {
        // Create threads T1 to T4
        Thread t1 = new Thread(new Worker(), "T1");
        Thread t2 = new Thread(new Worker(), "T2");
        Thread t3 = new Thread(new Worker(), "T3");
        Thread t4 = new Thread(new Worker(), "T4");

        // Start threads T1 to T4
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for threads T1 to T4 to complete
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // Now start thread T5
        Thread t5 = new Thread(() -> {
            System.out.println("T5 started processing.");
            // T5's processing logic here
        }, "T5");

        t5.start();

        // Wait for T5 to complete
        t5.join();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is processing.");
                Thread.sleep(500); // Simulate work
                System.out.println(Thread.currentThread().getName() + " finished processing.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
