package com.z0976190100.concurrent_tutorial;

import java.util.Random;

public class Producer implements Runnable {

    private MessageProxy messageProxy;

    public Producer(MessageProxy messageProxy) {
        this.messageProxy = messageProxy;
    }

    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            messageProxy.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        messageProxy.put("DONE");
    }

}
