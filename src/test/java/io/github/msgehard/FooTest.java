package io.github.msgehard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooTest {

    @Test
    public void thisAlwaysFails() {
        Assert.assertEquals(false, false);

    }
}