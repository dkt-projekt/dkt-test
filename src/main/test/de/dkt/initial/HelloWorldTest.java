package de.dkt.initial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public static void testConcatenate() {
        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.getMessageFor("");
        assertEquals("Hello World for !!!", result);
        result = helloWorld.getMessageFor("Julian");
        assertEquals("Hello World for Julian!!!", result);

    }
}
