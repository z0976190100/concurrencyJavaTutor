package com.z0976190100.concurrent_tutorial;

import java.util.Random;

public class Consumer implements Runnable {
    private MessageProxy messageProxy;

    public Consumer(MessageProxy messageProxy) {
        this.messageProxy = messageProxy;
    }

    public void run() {
        Random random = new Random();
        for (String message = messageProxy.take();
             ! message.equals("DONE");
             message = messageProxy.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}