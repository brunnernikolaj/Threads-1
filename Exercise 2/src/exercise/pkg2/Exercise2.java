package exercise.pkg2;

public class Exercise2 {

    public static void main(String[] args) {
        
        //To make this program thread-safe, use ConcurrentEven instead of Even
        Even obj = new Even();
        
        Thread testThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                int temp = obj.next();
                //If temp is not even
                if (temp % 2 != 0)
                    System.out.println(temp);
            }
        });
        
        Thread testThread2 = new Thread(testThread);
        
        testThread.start();
        testThread2.start();
    }
}

class Even {
    private int n = 0;

    public int next() {
        n++;
        n++;
        return n;
    }
}

class ConcurrentEven {
    private int n = 0;

    public synchronized int next() {
        n++;
        n++;
        return n;
    }
}
