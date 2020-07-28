package com.pogorelov.goitgradle;

import org.junit.*;

public class ServiceTest {

    @Test
    public void testMsg() {
        String result = new Service().getMsg();
        System.out.println("MESSAGE " + result);
        Assert.assertEquals("2 b || ! 2 b", result);
    }


}
