package com.app.reservation.repository;

import java.util.List;

public interface ReservationRepository {
	Reservation findById(int id);

	List<Reservation> findAll();

	Reservation save(Reservation reservation);

	void delete(int id);
}

