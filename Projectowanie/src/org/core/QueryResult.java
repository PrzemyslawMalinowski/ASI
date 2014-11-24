package org.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueryResult {

	private List<Room> rooms;
	private int nightsNumber;

	/**
	 * Konstruktor
	 * @param nightsNumber
	 */
	public QueryResult(int nightsNumber) {
		rooms = new ArrayList<Room>();
		this.nightsNumber = nightsNumber;
	}

	/**
	 * Pobiera list� pokoi
	 * @return
	 */
	public List<Room> getRooms() {
		return rooms;
	}

	/**
	 * Dodaje nowy pok�j
	 * @param roomForResult
	 */
	public void addRoom(Room roomForResult) {
		rooms.add(roomForResult);
	}

	/**
	 * Oblicza cen�
	 * @return
	 */
	public int price() {
		return nightsNumber * priceForRooms();
	}

	/**
	 * Cena za pokoje
	 * @return
	 */
	private int priceForRooms() {
		int totalPriceForOneDay = 0;
		for (Room room : rooms) {
			totalPriceForOneDay += (int) room.getPrice();
		}
		return totalPriceForOneDay;
	}

	/**
	 * Zlicza ��ka
	 * @return
	 */
	public int countBeds() {
		int beds = 0;
		for (Room room : rooms) {
			beds += room.n_persons();
		}
		return beds;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;

		if (!(other instanceof QueryResult))
			return false;

		QueryResult queryResult = (QueryResult) other;
		
		if (rooms.isEmpty() && queryResult.rooms.isEmpty())
			return true;
		
		Collections.sort(rooms);
		Collections.sort(queryResult.rooms);
		
		if (rooms.equals(queryResult.rooms))
			return true;
		
		return false;
	}

}
