package com.z0976190100.concurrent_tutorial;

import static java.lang.Thread.sleep;

public class DaemonKilla {

    @SuppressWarnings("deprication")
    public static void main(String[] args) throws InterruptedException{
        Thread daemonParrent = new Thread(new DaemonParrent());
        daemonParrent.start();
        sleep(10000);
        daemonParrent.stop();
        System.out.println(daemonParrent.isAlive());
        int i = 0;
        while (i<5){
            try{
                sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("we killed the daemonparrent?");
            System.out.println(!daemonParrent.isAlive());
            i++;
        }
    }
}
