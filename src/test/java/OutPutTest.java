import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OutPutTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private OutPut out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        out = new OutPut();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test3isPling(){
        Assert.assertEquals("Pling", out.setDrops(3));
    }

    @Test
    public void test5isPlang(){
        Assert.assertEquals("Plang", out.setDrops(5));
    }

    @Test
    public void test7isPlong(){
        Assert.assertEquals("Plong", out.setDrops(7));
    }

    @Test
    public void testReturnsRainDrop(){
        out.setDrops(3);
        out.printDrops(3);
        Assert.assertEquals("Pling", outContent.toString());
    }

    @Test
    public void testReturnsNumber(){
        out.printDrops(37);
        Assert.assertEquals("37", outContent.toString());
    }
}