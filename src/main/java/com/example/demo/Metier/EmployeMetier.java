package com.example.demo.Metier;

import com.example.demo.Entity.Employe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface EmployeMetier {
    public Optional<Employe> findEmployeById(String id);
    public Optional<Employe> findEmployeByNom(String nom);
    public Employe saveEmploye(Employe employe);
    public List<Employe> findAllEmploye();
    public void deleteEmploye(Employe employe);
    public Employe updateEmploye(String id, Employe employe);
}
