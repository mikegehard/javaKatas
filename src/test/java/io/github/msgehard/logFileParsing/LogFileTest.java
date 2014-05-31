package io.github.msgehard.logFileParsing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;

public class LogFileTest {

    @Test
    public void testMinimumDate() {
        String contents = "W, [2014-04-22T13:49:19.049260 #83516]  WARN -- : deliver B2C systems\n" +
                "W, [2014-05-10T13:49:19.049408 #83516]  WARN -- : transition sticky bandwidth";
        LogFile file = new LogFile(contents);

        LocalDate minDate = file.minDate();
        Assert.assertEquals(minDate, LocalDate.of(2014, Month.APRIL, 22));
    }

    @Test
    public void testMaximumDate() {
        String contents = "W, [2014-04-22T13:49:19.049260 #83516]  WARN -- : deliver B2C systems\n" +
                "W, [2014-05-12T13:49:19.049408 #83516]  WARN -- : transition sticky bandwidth\n" +
                "W, [2014-05-10T13:49:19.049408 #83516]  WARN -- : transition sticky bandwidth";
        LogFile file = new LogFile(contents);

        LocalDate minDate = file.maxDate();
        Assert.assertEquals(minDate, LocalDate.of(2014, Month.MAY, 12));
    }
}
