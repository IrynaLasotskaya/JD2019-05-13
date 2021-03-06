package by.it.izaykoff.jd02_02;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        System.out.println("Market opened");

        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new Cashier(i));
            threads.add(thread);
            thread.start();
        }

        int numberBuyer = 0;
        while (Dispatcher.marketIsOpened()) {
            int count = Util.rnd(2);
            for (int i = 0; i < count && Dispatcher.marketIsOpened(); i++) {
                Buyer buyer = new Buyer(++numberBuyer);
                buyer.start();
                threads.add(buyer);
            }
            Util.sleep(1000);
        }

        for (Thread buyer : threads) {
            try {
                buyer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Market closed");
    }
}
