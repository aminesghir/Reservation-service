package com.example.demo.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@RequiredArgsConstructor
public class Reservation implements Serializable {
    @Id
    private String id;
    private String lieuDepart;
    private String lieuDestination;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private List<Employe> employe;
    private Employe validateur;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuDestination() {
        return lieuDestination;
    }

    public void setLieuDestination(String lieuDestination) {
        this.lieuDestination = lieuDestination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(List<Employe> employe) {
        this.employe = employe;
    }

    public Employe getValidateur() {
        return validateur;
    }

    public void setValidateur(Employe validateur) {
        this.validateur = validateur;
    }
}
