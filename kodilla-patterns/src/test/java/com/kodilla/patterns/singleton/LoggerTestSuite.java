package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        Logger.getInstance().log("test");
        Assert.assertEquals("test", Logger.getInstance().getLastLog());
    }
}
