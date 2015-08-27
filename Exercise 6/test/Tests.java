/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercise.pkg6.MainWindow;
import java.awt.Dialog;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.timing.Pause;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Nikolaj
 */
public class Tests {

    public Tests() {
    }

    private FrameFixture app;

    @Before
    public void setUp() {
        app = new FrameFixture(new MainWindow());
    }

    @After
    public void tearDown() {
        app.cleanUp();
    }

    @Test
    public void test() throws InterruptedException {
        app.label("CountDownText").requireText("");
        app.button("CountDownBtn").click();
        app.robot.waitForIdle();
        app.label("CountDownText").requireText("Remains: 20");
        Pause.pause(1000);
        app.label("CountDownText").requireText("Remains: 19");
        Pause.pause(1000);
        app.label("CountDownText").requireText("Remains: 18");
        Pause.pause(1000);
        app.label("CountDownText").requireText("Remains: 17");
    }
}
