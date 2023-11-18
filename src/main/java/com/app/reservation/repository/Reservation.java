package com.app.reservation.repository;

public class Reservation {

	private int id;
	private String name;
	private String phoneNumber;
	private String reservationDate;
	private String checkOutTime;
	private int checkOut;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public int getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(int checkOut) {
		this.checkOut = checkOut;
	}

}
