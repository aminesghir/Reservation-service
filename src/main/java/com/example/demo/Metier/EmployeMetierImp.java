package com.example.demo.Metier;

import com.example.demo.Entity.Employe;
import com.example.demo.Repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
