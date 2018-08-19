package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        //When
        Logger.getInstance().log("User change save setting");
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("User change save setting", log);
    }
}
