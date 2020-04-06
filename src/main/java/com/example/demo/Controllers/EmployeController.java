package com.example.demo.Controllers;


import com.example.demo.Entity.Employe;
import com.example.demo.Entity.Reservation;
import com.example.demo.Metier.EmployeMetier;
import com.example.demo.Repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employe")
public class EmployeController {
    @Autowired
    EmployeMetier employeMetierImp;
    @Autowired
    EmployeRepository employeRepository;
    @GetMapping("/findall")
    public List<Employe> findAllEmploye(){
        return employeMetierImp.findAllEmploye();
    }
    @GetMapping("/find/{id}")
    public Employe findById(@PathVariable String id){
        return employeMetierImp.findEmployeById(id).get();
    }
    @PostMapping("/save")
    public Employe saveEmploye(@RequestBody Employe employe){
        return employeMetierImp.saveEmploye(employe);
    }
    @DeleteMapping("/delete")
    public void deleteEmploye(@RequestBody Employe employe){
        employeMetierImp.deleteEmploye(employe);
    }

    @PutMapping("/update/{id}")
    public Employe updateEmploye(@PathVariable String id, @RequestBody Employe employe) {
        return employeMetierImp.updateEmploye(id,employe);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) throws Exception {

        return employeRepository.findById(id)
                .map(employe -> {
                    employeRepository.delete(employe);
                    return ("employe deleted successfully");
                }).orElseThrow(() -> new Exception("employe not found with ref " + id));
    }
}
