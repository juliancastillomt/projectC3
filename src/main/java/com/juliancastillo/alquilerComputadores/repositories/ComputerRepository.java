package com.juliancastillo.alquilerComputadores.repositories;

import com.juliancastillo.alquilerComputadores.models.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.juliancastillo.alquilerComputadores.repositories.ComputerCRUDRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComputerRepository {

    @Autowired
    private ComputerCRUDRepository computerCrudRepository;

    public List<Computer> getAll(){
        return (List<Computer>) computerCrudRepository.findAll();
    }

    public Optional<Computer> getById(int id){
        return computerCrudRepository.findById(id);
    }

    public Computer save(Computer c){
        return computerCrudRepository.save(c);
    }

    public void delete(Computer c){
        computerCrudRepository.delete(c);
    }
}
