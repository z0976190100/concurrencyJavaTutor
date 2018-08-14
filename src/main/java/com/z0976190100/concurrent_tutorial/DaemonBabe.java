package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.sleep;

public class DaemonBabe implements Runnable {

    @Override
    public void run() {
        while (true) {

            try {

                System.out.println("Im alive!");

                    sleep(5);
            } catch (InterruptedException e) {
                System.out.println("ouch!");
                return;
            }
        }
    }
}
