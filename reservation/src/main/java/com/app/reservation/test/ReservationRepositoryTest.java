package com.app.reservation.test;

import com.app.reservation.repository.Reservation;
import com.app.reservation.repository.ReservationRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest
public class ReservationRepositoryTest {

    @Autowired
    private ReservationRepositoryImpl reservationRepository;

    @BeforeEach
    public void setUp() {
        // 테스트 데이터 추가
        Reservation res = new Reservation();
        res.setId(1);
        res.setName("John");
        res.setPhoneNumber("08012341234");
        res.setReservationDate("12/01");
        res.setCheckOutTime("12/14");
        res.setCheckOut(0);
        reservationRepository.save(res);
    }

    @Test
    public void testFindById() {
        Reservation reservation = reservationRepository.findById(1);
        assertNotNull(reservation);
        assertEquals("John", reservation.getName());
    }

    @Test
    public void testFindAll() {
        List<Reservation> reservations = reservationRepository.findAll();
        assertNotNull(reservations);
        assertEquals(1, reservations.size());
    }
}
