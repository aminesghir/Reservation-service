package com.example.demo.Repository;

import com.example.demo.Entity.Employe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeRepository extends MongoRepository<Employe,String> {
    public Optional<Employe> findEmployeByNom(String nom);
}
