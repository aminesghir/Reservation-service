package com.example.demo.Controllers;


import com.example.demo.Entity.Employe;
import com.example.demo.Metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employe")
public class EmployeController {
    @Autowired
    EmployeMetier employeMetierImp;
    @RequestMapping("/findall")
    @CrossOrigin
    public List<Employe> findAll(){
        return employeMetierImp.findAllEmploye();
    }
    @RequestMapping("/{id}")
    @CrossOrigin
    public Employe findById(@PathVariable String id){
        return employeMetierImp.findEmployeById(id).get();
    }
    @PostMapping("/save")
    @CrossOrigin
    public Employe saveEmploye(@RequestBody Employe employe){
        return employeMetierImp.saveEmploye(employe);
    }
    @PostMapping("/delete")
    @CrossOrigin
    public void deleteEmploye(@RequestBody Employe employe){
        employeMetierImp.deleteEmploye(employe);
    }
//    @PutMapping("/update/{id}")
//    @CrossOrigin
//    public Classe update(@PathVariable Long id, @RequestBody Classe classe) {
//        return classeMetierImp.updateGroupe(id,classe);
//    }
}
