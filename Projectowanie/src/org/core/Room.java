package org.core;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class Room implements Comparable<Object> {

	private List<Reservation> reservations;
	private String roomId;
	private int capacity;
	private double price;

	public Room(String roomId, int capacity) {
		this.roomId = roomId;
		this.capacity = capacity;
		this.reservations = new ArrayList<Reservation>();
	}

	public String name() {
		return roomId;
	}

	public int n_persons() {
		return capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;

		if (!(other instanceof Room))
			return false;
		Room room = (Room) other;
		return this.capacity == room.capacity
				&& this.roomId.equals(room.roomId);
	}

	@Override
	public int compareTo(Object obj) {
		Room room = (Room) obj;
		return Integer.parseInt(roomId) - Integer.parseInt(room.roomId);
	}

	public void bookRoom(Reservation reservation) {
		reservations.add(reservation);
	}

	public boolean isRoomReserved(LocalDate startDate, LocalDate endDate) {
		for (Reservation reservation : reservations) {
			if (datesMatches(startDate, endDate, reservation)) {
				return true;
			}
		}
		return false;
	}

	private boolean datesMatches(LocalDate startDate, LocalDate endDate,
			Reservation reservation) {
		
		//TODO: Trzeba daæ equale do tego
		if (startDate.isAfter(reservation.getStartDate()) && startDate.isBefore(reservation.getEndDate()) ||
			endDate.isAfter(reservation.getStartDate()) && endDate.isBefore(reservation.getEndDate()) ||
			startDate.isBefore(reservation.getStartDate()) && endDate.isAfter(reservation.getEndDate())) {
			return true;
		} else {
			return false;
		}
	}
}
