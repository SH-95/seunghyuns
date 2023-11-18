package com.app.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.reservation.repository.Reservation;
import com.app.reservation.service.ReservationService;
import com.app.reservation.service.ReservationServiceImpl;


@Controller
@RequestMapping("reservations")
public class ReservationController {
	

	// サービスを持ってくる
	@Autowired
	private ReservationServiceImpl reservationService;

	@GetMapping("/{id}") // idを変数として情報を持ってくる
	public Reservation getReservation(@PathVariable int id) {
		return reservationService.findById(id);
	}

	// すべて検索
	@GetMapping
	public List<Reservation> getAllReservations() {
		return reservationService.findAll();
	}

	// 予約作成
	@PostMapping
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return reservationService.create(reservation);
	}

	// 修正
	@PutMapping("/{id}")
	public Reservation updateReservation(@PathVariable int id, @RequestBody Reservation reservation) {
		reservation.setId(id);
		return reservationService.update(id, reservation);
	}

	// 削除
	@DeleteMapping("/{id}")
	public void deleteReservation(@PathVariable int id) {
		reservationService.delete(id);
	}

	@GetMapping("/reservations")
	public String list(Model model) {
	    List<Reservation> reservations = reservationService.findAll();
	    model.addAttribute("reservations", reservations);
	    model.addAttribute("exampleValue", 1);

	    return "reservations";
	}



}
