package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class DaemonParrent implements Runnable {

    public Thread dBabe;

    @Override
    public void run() {
        System.out.println("Unlesashing a daemon!");

        dBabe = new Thread(new DaemonBabe());
       dBabe.setDaemon(true);
        dBabe.start();
        while (!interrupted()) {
            while (true) {
                try {
                    sleep(3000);
                    System.out.println("__________its enough!___________");
                } catch (InterruptedException e) {
                   dBabe.interrupt();
                    return;
                }
            }
        }

    }
}
