package com.example.demo.Metier;

import com.example.demo.Entity.Employe;
import com.example.demo.Repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeMetierImp implements EmployeMetier {
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public Optional<Employe> findEmployeById(String id) {
        return employeRepository.findById(id);
    }

    @Override
    public Optional<Employe> findEmployeByNom(String nom) {
        return employeRepository.findEmployeByNom(nom);
    }

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> findAllEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public void deleteEmploye(Employe employe) {
        employeRepository.delete(employe);

    }

    @Override
    public Employe updateEmploye(String id, Employe employe) {
        Employe employeToUpdate = employeRepository.findById(id).get();
        employeToUpdate.setNom(employe.getNom());
        employeToUpdate.setPrenom(employe.getPrenom());
        employeToUpdate.setPhone(employe.getPhone());
        employeToUpdate.setEmail(employe.getEmail());
        employeToUpdate.setLogin(employe.getLogin());
        employeToUpdate.setMotDePasse(employe.getMotDePasse());
        return employeRepository.save(employeToUpdate);
    }


}
