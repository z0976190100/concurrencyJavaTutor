package com.z0976190100.concurrent_tutorial;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        MessageProxy messageProxy = new MessageProxy();
        (new Thread(new Producer(messageProxy))).start();
        (new Thread(new Consumer(messageProxy))).start();
    }
}
