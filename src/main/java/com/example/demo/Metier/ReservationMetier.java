package com.example.demo.Metier;

import com.example.demo.Entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationMetier {
    public Optional<Reservation> findReservationById(String id);
    public Reservation saveReservation(Reservation reservation);
    public List<Reservation> findAllReservation();
    public void deleteReservation(Reservation reservation);
}
