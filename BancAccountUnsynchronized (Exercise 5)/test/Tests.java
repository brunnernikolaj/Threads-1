/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bancaccountunsynchronized.BankAppExecutor;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Nikolaj
 */
public class Tests {

    public Tests() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void hello() {
        BankAppExecutor.main(null);
        
        String list[] = new String[10];
        
        for (int i = 0; i < 10; i++) {
            list[i] = "OK, Account value after all transactions: 0.0\r";
        }
        
        String list2[] = outContent.toString().split("\n");
        
        assertArrayEquals(list, list2);
    }
}
