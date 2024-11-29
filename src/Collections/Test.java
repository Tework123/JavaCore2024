package Collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.sleep(3000);
        myThread2.start();
        System.out.println("000");

    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }
    }
}
