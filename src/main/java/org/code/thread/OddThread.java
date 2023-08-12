package org.code.thread;

public class OddThread extends Thread {
    private int m;

    public OddThread(int m) {
        this.m = m;
    }
    @Override
    public void run() {
        for (int i = 1; i <= m; i += 2)
            System.out.println("OddThread: " + i);
    }

    @Override
    public String toString() {
        return "OddThread";
    }
}
