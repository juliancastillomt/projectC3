package com.juliancastillo.alquilerComputadores.services;

import com.juliancastillo.alquilerComputadores.models.Computer;
import com.juliancastillo.alquilerComputadores.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository computerRepository;


    public List<Computer> getAll(){
        return computerRepository.getAll();
    }

    public Computer save(Computer computer){
        if(computer.getId() == null){
            return computerRepository.save(computer);
        }else{
            Optional<Computer> opt = computerRepository.getComputer(computer.getId());
            if(opt.isEmpty()){
                return computerRepository.save(computer);
            }else{
                return computer;
            }
        }
    }
}
