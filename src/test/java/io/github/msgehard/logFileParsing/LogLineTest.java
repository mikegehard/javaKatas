package io.github.msgehard.logFileParsing;

import org.testng.annotations.Test;

import java.time.LocalDate;
import static org.testng.Assert.*;

public class LogLineTest {

    @Test
    public void canGetDate() {
        LogLine line = new LogLine("W, [2014-05-10T13:49:19.049408 #83516]  WARN -- : transition sticky bandwidth");

        assertEquals(LocalDate.of(2014, 5, 10), line.date());
    }
}