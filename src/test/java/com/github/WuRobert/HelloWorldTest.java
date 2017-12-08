package com.github.WuRobert;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void fcu() throws Exception {
        HelloWorld a=new HelloWorld();
        assertEquals(a.fcu(6),"是");
    }

}
