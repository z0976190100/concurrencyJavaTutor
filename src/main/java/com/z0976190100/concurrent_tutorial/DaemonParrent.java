package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class DaemonParrent implements Runnable {

    @Override
    public void run() {
        System.out.println("Unlesashing a daemon!");

        Thread babe = new Thread(new DaemonBabe());
        babe.setDaemon(true);
        babe.start();
        while (!interrupted()) {
            while (true) {
                try {
                    sleep(3000);
                    System.out.println("__________its enough!___________");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }

    }
}
