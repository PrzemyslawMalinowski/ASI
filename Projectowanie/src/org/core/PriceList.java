package org.core;

import java.util.List;

import org.joda.time.LocalDate;

public class PriceList {
    private List<Season> seasons;
    
    public double calculatePrice(LocalDate from, LocalDate to){
        double price = 0;
        
        for(Season season : seasons){
            price += season.getPrice(from, to);
        }
        
        return price;
    }
}