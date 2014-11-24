package org.core;

public class Client {
	private String name;
	private String surname;
	private String email;
	private String address;

	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getEmail() {
		return email;
	}

	String getAddress() {
		return address;
	}
}
