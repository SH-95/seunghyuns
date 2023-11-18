package com.app.reservation.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositoryImpl implements ReservationRepository {
	private static final Map<Integer, Reservation> resMap = new ConcurrentHashMap<Integer, Reservation>();

	static {
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setName("Send a e-mail");
        resMap.put(reservation.getId(), reservation);
    }
	
	@Override
	public Reservation findById(int id) {
		return resMap.get(id);
	}

	@Override
	public List<Reservation> findAll() {
		return new ArrayList<>(resMap.values());
	}

	@Override
	public Reservation save(Reservation reservation) {
		resMap.put(reservation.getId(), reservation);
		return reservation;
	}

	@Override
	public void delete(int id) {
		resMap.remove(id);
	}

	
	
}
