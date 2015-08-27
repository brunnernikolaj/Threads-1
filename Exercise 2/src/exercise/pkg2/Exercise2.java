/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg2;

/**
 *
 * @author Nikolaj
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //To make this program thread-safe, use ConcurrentEven instead of Even
        Even obj = new Even();
        
        Thread testThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
            int temp = obj.next();
            
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