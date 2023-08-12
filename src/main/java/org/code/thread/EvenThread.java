package org.code.thread;

public class EvenThread extends Thread {

    private int n;

    public EvenThread(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        int temp = 0;
        for (int i = 2; i <= n; i += 2)
            temp = i;
    }

    @Override
    public String toString() {
        return "EvenThread";
    }
}
