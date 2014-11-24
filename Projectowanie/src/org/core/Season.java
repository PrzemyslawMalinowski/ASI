package org.core;

import org.joda.time.LocalDate;

public class Season {

    private final LocalDate seasonFrom;
    private final LocalDate seasonTo;
    private final double price;

    public Season(LocalDate from, LocalDate to, double price) {
        this.seasonFrom = from;
        this.seasonTo = to;
        this.price = price;
    }

    public double getPrice(LocalDate orderFrom, LocalDate orderTo) {

        return calculateNights(orderFrom, orderTo) * price;
    }

    private int calculateNights(LocalDate orderFrom, LocalDate orderTo) {

    	int nights = 0;
        LocalDate start = (orderFrom.isBefore(seasonFrom) ? seasonFrom : orderFrom);
        LocalDate finish = (orderTo.isAfter(seasonTo) ? seasonTo : orderTo);
        
        while (start.isBefore(finish)) {
            start.plusDays(1);
            nights += 1;
        }
        return nights;
    }

}
