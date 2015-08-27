package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        long oneBillion = 1000000000;

        //Sum from one to a billion
        new Thread(() -> {
            long sum = 0;
            for (long i = 1; i < oneBillion; i++) {
                sum += i;
            }
            System.out.printf("Sum of one to a billion : %d \n", sum);
        }).start();

        //Print the numbers from 1 to 5,  Pause for 2 seconds between each print
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    System.out.printf("2 second interval : %d \n", i);
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        // Print all numbers from 10 and up. Pause for 3 seconds between each print.
        Thread t3 = new Thread(() -> {
            int count = 10;
            while (true) {
                try {
                    System.out.printf("3 second interval : %d \n", count++);
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("Thread 3 Stoped");
                    break;
                }
            }
        });

        //Start thread 3 and wait 10 sec, then interrupt the thread 3
        t3.start();
        Thread.sleep(10000);
        t3.interrupt();
    }

}
