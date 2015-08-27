package ex4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {

    static final long DELAY_VAL = 10000;
    long count = 0;

    public long getValue() {
        return count;
    }

    public void incr() {
        count++;
    }

    public synchronized void incrSync() {
        count++;
    }

    // As an example of AtomicLong usage
    AtomicLong count_example = new AtomicLong();

    public void incrAtomic() {
        count_example.getAndIncrement();
    }

    private final ReentrantLock lock = new ReentrantLock();

    public void incrLock() {
        lock.lock();
        try{
            count++;
        } finally {
            lock.unlock();
        }       
    }

}
