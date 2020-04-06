package com.example.demo.Controllers;


import com.example.demo.Entity.Reservation;
import com.example.demo.Metier.ReservationMetier;
import com.example.demo.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    ReservationMetier reservationMetierImp;
    @Autowired
    ReservationRepository reservationRepository;
    @GetMapping("/findall")
    public List<Reservation> findAllReservation(){
        return reservationMetierImp.findAllReservation();
    }
    @RequestMapping(value = "/{id}")
    public Reservation findById(@PathVariable String id){
        return reservationMetierImp.findReservationById(id).get();
    }
    @PostMapping("/save")
        public Reservation saveReservation(@RequestBody Reservation reservation){
        System.out.println(reservation.toString());
            return reservationMetierImp.saveReservation(reservation);
    }
    @PostMapping("/delete")
    public void deleteReservation(@RequestBody Reservation reservation){
        reservationMetierImp.deleteReservation(reservation);
    }
    @PutMapping("/update/{id}")
    public Reservation updateReservation(@PathVariable String id, @RequestBody Reservation reservation) {
        return reservationMetierImp.updateReservation(id,reservation);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) throws Exception {

        return reservationRepository.findById(id)
                .map(reservation -> {
                    reservationRepository.delete(reservation);
                    return ("reservation deleted successfully");
                }).orElseThrow(() -> new Exception("reservation not found with ref " + id));
    }
}
