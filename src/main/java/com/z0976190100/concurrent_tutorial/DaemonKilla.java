package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.sleep;

public class DaemonKilla {

    @SuppressWarnings("deprication")
    public static void main(String[] args) throws InterruptedException{
        DaemonParrent dP = new DaemonParrent();
        Thread daemonParrent = new Thread(dP);
        daemonParrent.start();
        sleep(10000);
        daemonParrent.interrupt();
        System.out.println("SMASH!");
        sleep(2000);
       // System.out.println(daemonParrent.isAlive());
        int i = 0;
        while (i<5){
            try{
                sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("we killed the daemon-papa?");
            System.out.println(!daemonParrent.isAlive());
            System.out.println("And what about his little shit?");
            System.out.println(!dP.dBabe.isAlive());
            i++;
        }
    }
}
