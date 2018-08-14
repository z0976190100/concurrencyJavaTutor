package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.sleep;

public class DaemonBabe implements Runnable {

    @Override
    public void run() {
        while (true) {

            try {
                sleep(3000);
                System.out.println("Im alive!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
