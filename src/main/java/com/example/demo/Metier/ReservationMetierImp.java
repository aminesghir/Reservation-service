package com.example.demo.Metier;

import com.example.demo.Entity.Reservation;
import com.example.demo.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationMetierImp implements ReservationMetier {
    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public Optional<Reservation> findReservationById(String id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> findAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);

    }

    @Override
    public Reservation updateReservation(String id, Reservation reservation) {
        Reservation reservationToUpdate = reservationRepository.findById(id).get();
        reservationToUpdate.setLieuDepart(reservation.getLieuDepart());
        reservationToUpdate.setLieuDestination(reservation.getLieuDestination());
        reservationToUpdate.setDate(reservation.getDate());
        reservationToUpdate.setEmployes(reservation.getEmployes());
        reservationToUpdate.setValidateurs(reservation.getValidateurs());
        return reservationRepository.save(reservationToUpdate);

    }


}
