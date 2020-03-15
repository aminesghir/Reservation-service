package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
@AllArgsConstructor
@RequiredArgsConstructor
public class Employe implements Serializable {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String motDePasse;
    private String email;
    private Long phone;

}
