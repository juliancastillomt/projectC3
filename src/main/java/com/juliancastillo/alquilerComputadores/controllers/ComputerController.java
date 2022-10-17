package com.juliancastillo.alquilerComputadores.controllers;

import com.juliancastillo.alquilerComputadores.models.Computer;
import com.juliancastillo.alquilerComputadores.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;


    @GetMapping("/all")
    public List<Computer> getComputer(){
        return computerService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer){
        return computerService.save(computer);
    }

}
