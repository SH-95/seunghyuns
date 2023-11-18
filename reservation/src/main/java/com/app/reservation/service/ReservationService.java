package com.app.reservation.service;

import java.util.List;

import com.app.reservation.repository.Reservation;

public interface ReservationService {
	Reservation create(Reservation reservation); // 예약 생성

	Reservation update(int id, Reservation reservation); // 예약 업데이트

	Reservation findById(int id); // ID로 예약 조회

	List<Reservation> findAll(); // 모든 예약 조회

	void delete(int id); // 예약 삭제
	// 다른 비즈니스 로직 메서드 추가 가능
}
