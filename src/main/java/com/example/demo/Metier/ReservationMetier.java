package com.example.demo.Metier;

import com.example.demo.Entity.Reservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface ReservationMetier {
    public Optional<Reservation> findReservationById(String id);
    public Reservation saveReservation(Reservation reservation);
    public List<Reservation> findAllReservation();
    public void deleteReservation(Reservation reservation);
    public Reservation updateReservation(String id, Reservation reservation);
}
