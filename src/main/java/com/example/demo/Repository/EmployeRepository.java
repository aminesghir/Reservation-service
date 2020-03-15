package com.example.demo.Repository;

import com.example.demo.Entity.Employe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends MongoRepository<Employe,String> {
}
