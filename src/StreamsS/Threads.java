package StreamsS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread1 = new MyThread();
//        MyThread2 thread2 = new MyThread2();
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println("13");
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);
        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "HELLO");
            System.out.println("CUDA LUT");

        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
