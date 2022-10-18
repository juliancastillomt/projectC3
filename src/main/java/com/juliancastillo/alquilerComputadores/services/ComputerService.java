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

    public Optional<Computer>getById(int id){
        return computerRepository.getById(id);
    }

    public Computer save(Computer c){
        if(c.getIdComputer() == null){
            return computerRepository.save(c);
        }
        return computer;
    }

    public boolean delete(int id){
        Optional<Computer> cOp = computerRepository.getById(id);
        if(cOp.isPresent()){
            computerRepository.delete(cOp.get());
            return true;
        }
        return false;
    }

    public Computer update(Computer c){
        if(c.getIdComputer()!=null){
            Optional<Computer> old= computerRepository.getById(c.getIdComputer());
            if(old.isPresent()){
                Computer k=old.get();
                if(c.getName()!=null){
                    k.setName(c.getName());
                }
                if(c.getDescription()!=null){
                    k.setDescription(c.getDescription());
                }
                if(c.getBrand()!=null){
                    k.setBrand(c.getBrand());
                }
                if(c.getYear()!=null){
                    k.setYear(c.getYear());
                }
                if(c.getCategory()!=null){
                    k.setCategory(c.getCategory());
                }
                return computerRepository.save(k);
            }
        }
        return c;
    }
}
