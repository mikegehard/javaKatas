package io.github.msgehard.logFileParsing;

import java.time.LocalDate;

public class LogLine{
    private String line;
    public LogLine(String initialLine) {
        line = initialLine;
    }

    public LocalDate date() {
        return LocalDate.parse(line.substring(4, 14));
    }
}
