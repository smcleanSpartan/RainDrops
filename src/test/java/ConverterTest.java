import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ConverterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private Converter con;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        con = new Converter();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testInputValue() {
        con.Convert(11);
        String expected = "11";
        Assert.assertEquals(expected, outContent.toString());
    }
    @Test
    public void testNegativeInputValue() {
        con.Convert(-11);
        String expected = "-11";
        Assert.assertEquals(expected, outContent.toString());
    }

    @Test
    public void testNegativeInputValueFactorial() {
        con.Convert(-15);
        String expected = "PlingPlang";
        Assert.assertEquals(expected, outContent.toString());
    }

    @Test
    public void testPling() {
        con.Convert(3);
        Assert.assertEquals("Pling", outContent.toString());
    }

    @Test
    public void testPlingPling() {
        con.Convert(9);
        Assert.assertEquals("PlingPling", outContent.toString());
    }

    @Test
    public void testPlingPlang() {
        con.Convert(15);
        Assert.assertEquals("PlingPlang", outContent.toString());
    }

    @Test
    public void testPlang(){
        con.Convert(5);
        Assert.assertEquals("Plang", outContent.toString());

    }

    @Test
    public void testPlangPlang() {
        con.Convert(25);
        Assert.assertEquals("PlangPlang", outContent.toString());
    }

    @Test
    public void testPlangPlong() {
        con.Convert(35);
        Assert.assertEquals("PlangPlong", outContent.toString());
    }

    @Test
    public void testPlong() {
        con.Convert(7);
        Assert.assertEquals("Plong", outContent.toString());
    }

    @Test
    public void testPlongPlong() {
        con.Convert(49);
        Assert.assertEquals("PlongPlong", outContent.toString());
    }

    @Test
    public void testPlingPlangPlong() {
        con.Convert(105);
        Assert.assertEquals("PlingPlangPlong", outContent.toString());
    }
}
