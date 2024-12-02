package Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentAndSynchronizedCol {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> sourse = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            sourse.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> {

            target.addAll(sourse);
            synchronized (target)
            {
                for (int i = 0; i < target.size(); i++) {
                    System.out.println(target.get(i));
                }
            }
        };
        Runnable runnable2 = () -> {
            target.remove(10);
            target.remove(15);
            target.remove(30);
            target.remove(4);

        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(target);

    }
}
