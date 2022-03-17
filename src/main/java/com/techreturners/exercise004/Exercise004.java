package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Class adds 1 GIGA SECOND to the given date or date time  .
 */
public class Exercise004 {

    LocalDateTime localDateTime ;
    long GIGA_SECONDS = 1000000000 ;

    public Exercise004(LocalDate date) {
        localDateTime = LocalDateTime.of(date, LocalTime.MIDNIGHT ).plusSeconds(GIGA_SECONDS);
    }

    public Exercise004(LocalDateTime dateTime) {
        localDateTime = dateTime.plusSeconds(GIGA_SECONDS);
    }

    public LocalDateTime getDateTime() {
        return localDateTime ;
    }
}
