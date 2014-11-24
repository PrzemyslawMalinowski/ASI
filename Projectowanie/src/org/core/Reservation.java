package org.core;

import org.joda.time.LocalDate;

public class Reservation {
    
    private LocalDate startDate;
    private LocalDate endDate;
    private Client client;
    public Reservation(LocalDate startDate, LocalDate endDate, Client client) { 
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }

    public Client getPerson() {
        return client;
    }
}
