package com.sanver.learning.cucumbersample;

import cucumber.api.Transformer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTransformer extends Transformer<LocalDate> {
    @Override
    public LocalDate transform(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(s, formatter);
    }
}
