package com.example.demo.Controllers;


import com.example.demo.Entity.Reservation;
import com.example.demo.Metier.ReservationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class ReservationController {
    @Autowired
    ReservationMetier reservationMetierImp;
    @RequestMapping("/findall")
    @CrossOrigin
    public List<Reservation> findAll(){
        return reservationMetierImp.findAllReservation();
    }
    @RequestMapping("/{id}")
    @CrossOrigin
    public Reservation findById(@PathVariable String id){
        return reservationMetierImp.findReservationById(id).get();
    }
    @PostMapping("/save")
    @CrossOrigin
    public Reservation saveReservation(@RequestBody Reservation reservation){
        return reservationMetierImp.saveReservation(reservation);
    }
    @PostMapping("/delete")
    @CrossOrigin
    public void deleteReservation(@RequestBody Reservation reservation){
        reservationMetierImp.deleteReservation(reservation);
    }
//    @PutMapping("/update/{id}")
//    @CrossOrigin
//    public Classe update(@PathVariable Long id, @RequestBody Classe classe) {
//        return classeMetierImp.updateGroupe(id,classe);
//    }
}
