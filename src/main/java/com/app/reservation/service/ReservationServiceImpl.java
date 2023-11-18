package com.app.reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.reservation.repository.Reservation;
import com.app.reservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation create(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation update(int id, Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation findById(int id) {
		return reservationRepository.findById(id);
	}

	@Override
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public void delete(int id) {
		reservationRepository.delete(id);

	}

}
