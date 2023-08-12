package org.java.thread;

import org.code.thread.EvenThread;
import org.code.thread.OddThread;
import org.junit.Test;

public class ThreadTest {
    @Test
    public void testEvenThread() throws InterruptedException {
        EvenThread evenThread = new EvenThread(10);
        evenThread.start();
        evenThread.join();
    }

    @Test
    public void testOddThread() throws InterruptedException {
        OddThread oddThread = new OddThread(15);
        oddThread.start();
        oddThread.join();
    }

    @Test
    public void testConcurrentOddEvenThreads() throws InterruptedException {
        int n = 50;
        int m = 150;
        EvenThread evenThread =  new EvenThread(n);
        OddThread oddThread = new OddThread(m);

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();

    }

    @Test
    public void testConcurrentOddEvenThreadsWithLargerValues() throws InterruptedException {
        int n = 10000000;
        int m = 10000000;
        EvenThread evenThread =  new EvenThread(n);
        OddThread oddThread = new OddThread(m);

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();

    }

}
