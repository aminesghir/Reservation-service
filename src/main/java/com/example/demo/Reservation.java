package com.example.demo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

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
//    private Employe employe;
//    private Employe validateur;

}
