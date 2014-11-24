package org.core.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.core.Hotel;
import org.core.QueryResult;
import org.core.Room;
import org.joda.time.LocalDate;
import org.junit.Test;

public class Exysajsys1 {
	
	private Hotel hotel;
	private LocalDate start;
    private LocalDate stop;
    private int nigths;
    private List<QueryResult> list;

	public Exysajsys1() {
		hotel = new Hotel();
		start = LocalDate.now();
		stop = LocalDate.now().plusDays(7);
		nigths = start.compareTo(stop) - 1;
	}
	
	@Test
    public void test1() {
        list = hotel.findFreeRooms(start, stop, 2);
        assertEquals(0, list.size());
    }
	
	@Test
    public void test2() {
        Room room = new Room("1230", 2);
        room.setPrice(180);
        hotel.add(room);

        list = hotel.findFreeRooms(start, stop, 1);
        assertEquals(1, list.size());

        QueryResult theOnlyQueryResult = list.get(0);
        int p = 180 * nigths;
        int price = theOnlyQueryResult.price();
        assertEquals(p, price);
    }

}
