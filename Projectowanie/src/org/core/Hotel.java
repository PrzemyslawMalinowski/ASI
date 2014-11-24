package org.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.joda.time.LocalDate;

public class Hotel {

	private List<Room> rooms;
	private LocalDate start;
	private LocalDate end;
	private QueryResult cheapestEva;
	
	/**
	 * Konstruktor
	 */
	public Hotel() {
		rooms = new ArrayList<Room>();
	}

	/**
	 * Dodaje nowy pokój do hotelu
	 * 
	 * @param room
	 */
	public void add(Room room) {
		rooms.add(room);
	}

	/**
	 * Pobiera pokój po nazwie
	 * 
	 * @param name
	 * @return
	 */
	public Room room(String name) {
		for (Room r : rooms)
			if (r.name().equals(name))
				return r;
		return null;
	}

	/**
	 * Szuka wolnych pokoi
	 * @param start
	 * @param end
	 * @param n_persons
	 * @return
	 */
	public List<QueryResult> findFreeRooms(LocalDate start, LocalDate end, int n_persons) {
		this.start = start;
		this.end = end;
		if (rooms.isEmpty()) {
			return new ArrayList<>();
		} else {
			return findCheapestRoom(start, end, n_persons);
		}
	}
	
	/**
	 * Poszukuje najtañszego pokoju
	 * @param start
	 * @param end
	 * @param persons
	 * @return
	 */
	private List<QueryResult> findCheapestRoom(LocalDate start, LocalDate end, int persons){
		List<Room> free = new ArrayList<>();
		List<QueryResult> qr = new ArrayList<>();
		
		for(Room room : rooms){
			if(!room.isRoomReserved(start, end)){
				QueryResult q = new QueryResult(start.compareTo(end));
				q.addRoom(room);
				qr.add(q);
			}
		}
		
		QueryResult result = null;
		
		if(!qr.isEmpty()) {
			
			double min = qr.get(0).price();
			int p = 0;
			
			for(QueryResult res : qr){
				if(res.price() < min){
					min = res.price();
					p = qr.indexOf(res);
				}
			}
			
			result = qr.get(p);
		}
		
		return Collections.singletonList(result);
	}


	/**
	 * DOdaje rezerwacjê
	 * @param start
	 * @param end
	 * @param result
	 * @param person
	 */
	public void book(LocalDate start, LocalDate end, QueryResult result, Client person) {
		
		for (Room room : result.getRooms()) {
			room.bookRoom(new Reservation(start, end, person));
		}
		
	}
}
