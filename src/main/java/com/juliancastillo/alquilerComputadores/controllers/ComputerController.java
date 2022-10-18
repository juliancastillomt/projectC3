package com.juliancastillo.alquilerComputadores.controllers;

import com.juliancastillo.alquilerComputadores.models.Computer;
import com.juliancastillo.alquilerComputadores.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping("/all")
    public List<Computer> getAll(){
        return computerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Computer> getById(@PathVariable("id") int id){
        return computerService.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer c){
        return computerService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer c){
        return computerService.update(c);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return computerService.delete(id);
    }

}
