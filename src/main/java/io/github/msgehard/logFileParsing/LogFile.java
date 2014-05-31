package io.github.msgehard.logFileParsing;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LogFile {
    private Stream<LogLine> lines;
    private Comparator<LogLine> ascendingDate;

    public LogFile(String contents) {
        lines = Arrays.asList(contents.split("\n")).stream().map(line -> new LogLine(line));
        ascendingDate = (line1, line2) -> line1.date().compareTo(line2.date());
    }

    public LocalDate minDate() {
        return lines.sorted(ascendingDate).findFirst().get().date();
    }

    public LocalDate maxDate() {
        return lines.sorted(ascendingDate.reversed()).findFirst().get().date();
    }
}
