package com.example.demo.Metier;

import com.example.demo.Entity.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeMetier {
    public Optional<Employe> findEmployeById(String id);
    public Employe saveEmploye(Employe employe);
    public List<Employe> findAllEmploye();
    public void deleteEmploye(Employe employe);
}
